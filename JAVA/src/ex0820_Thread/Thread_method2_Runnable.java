package ex0820_Thread;

public class Thread_method2_Runnable {
	public static void main(String[] args) {
		User3 us = new User3();
		Thread t = new Thread(us); // 2-1)
		
		t.start(); // 3) 스레드 시작
	
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("메인-"+i);
				Thread.sleep(100);
			}
			System.out.println("main-end...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


// 쓰레드를 만드는 두번째 방법
// 1. Runnable 인터페이스를 구현한 클래스를 만든다.
// 2. run메소드를 재정의 한다. 
//    2-1) Thread 객체를 생성하면서 1) 클래스의 객체를 생성하여 Thread생성자에 인수로 넘긴다.
// 3. 2-1)에서 생성한 Thread 클래스 객체의 start() 메소드 호출
class User3 implements Runnable{

	@Override
	public void run() {
		
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("스레드-"+i);
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}

