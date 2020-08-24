package ex0821_Thread2_Network;

public class Thread_ThreadStop_Ex4 {

	public static void main(String[] args) {
		MyThread4 t = new MyThread4();
		
		t.start();
		 try {
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		t.myThreadStop();
		System.out.println("메인 종료..");
	}
}

class MyThread4 extends Thread{
	private boolean bStop = false;

	@Override
	public void run() {
		long n =0;
		
		try {
			while(! bStop) {
				n++;
				System.out.println("스레드-"+n);
				sleep(500);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("스레드 종료...");
		super.run();
	}
	
	public void myThreadStop() {
		bStop = true;
	}
	
}