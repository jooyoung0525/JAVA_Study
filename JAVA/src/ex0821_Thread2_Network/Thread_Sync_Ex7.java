package ex0821_Thread2_Network;

public class Thread_Sync_Ex7 {

	public static void main(String[] args) {
		ThreadEx1 te =new ThreadEx1();
		Thread t1 =new Thread(te);
		Thread t2 =new Thread(te);
		
		t1.start();
		t2.start();
	}

}
class ThreadEx1 implements Runnable{
	private int money = 10000;
	public int getMoney() {
		return money;
	}
	public int drawMoney(int m) {
		money-=m;
		return m;
	}
	@Override
	public void run() {
		int m=6000;
		int n;
		String msg = null;
		try {
			if(getMoney()>=m) {
				Thread.sleep(200);
				
				n=drawMoney(m);
				msg="인출 성공";
			}else {
				n=0;
				msg="인출 실패!";
			}
			 System.out.println(msg+",인출금액:"+n+", 잔고:"+ getMoney());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}