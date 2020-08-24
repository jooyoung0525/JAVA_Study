package ex0821_Thread2_Network;

public class Thread_Interrupt_Ex3 {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread3());
		t.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
//		t.stop(); // "스레드 종료" 는 출력되지 않는다. 절대 stop 사용 금지..
		t.interrupt();
		// 인터럽트를 받은 스레드가 sleep() , wait(), join() 상태인 경우
		// InterruptedException 발생
		System.out.println("메인 종료...");
	}
}

class MyThread3 implements Runnable{

	@Override
	public void run() {
		long n =0;
		try {
			while(true) {
				n++;
				System.out.println("스레드-"+n);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("인터럽트 됨");
		}
		System.out.println("스레드 종료...");
		
	}
	
}