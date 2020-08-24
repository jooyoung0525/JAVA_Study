package ex0821_Thread2_Network;

import java.util.concurrent.TimeUnit;

public class Thread_TimeUnit_Ex2 {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2("A");
		MyThread2 t2 = new MyThread2("B");
		MyThread2 t3 = new MyThread2("C");
		
		//CPU 상태에 따라 출력순서 상이함
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main end...");
		
		//우선순위 설정
		t3.setPriority(Thread.MAX_PRIORITY); //10
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t1.setPriority(Thread.MIN_PRIORITY); //1
	}
}

class MyThread2 extends Thread {
	public MyThread2() {
	}
	public MyThread2(String name) {
		super(name);
	}
	
	
	@Override
	public void run() {
		for(int i =1 ; i<=10;i++) {
			try {
				System.out.println(getName()+":"+i);
				TimeUnit.MILLISECONDS.sleep(10);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		super.run();
	}
	
}