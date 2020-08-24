package ex0821_Thread2_Network;

public class Thread_Sync_Ex10 {
	public static void main(String[] args) {
		ThreadTest4 tt = new ThreadTest4();
		
		Thread t1=new Thread(tt);
		Thread t2=new Thread(tt);
		
		t1.start();
		t2.start();
	}
}
class ThreadTest4 implements Runnable{
	private long money = 10000;
	
	public long getMoney() {
		return money;
	}
	
	public void drawMoney(long m) {
		System.out.print(Thread.currentThread().getName()+":");
		if(getMoney()>=m) {
			money -=m;
			System.out.println(", 잔액:"+getMoney());
		}else {
			System.out.println("잔액 부족...");
		}
	}
	@Override
	public void run() {
		synchronized(this) {
			for(int i = 0 ; i<10 ; i++) {
				if(getMoney()<=0) {
					
					this.notifyAll();
					break;
				}
			
			drawMoney(1000);
			if(getMoney()%2000==0) {
				try {
					//synchronized 에서만 사용
					//notify() 또는  notifyAll() 을 만날때 까지 대기
					this.wait();
					
				} catch (Exception e) {
					// TODO: handle exception
				}
			}else {
				this.notify();
			}
			}
		}
	}
	
}