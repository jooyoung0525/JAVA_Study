package ex0820_Thread;

public class Thread_method1_Thread1 {
	public static void main(String[] args) {

		User2 u = new User2();
		
		//u.run(); // run()을 호출하면 스레드가 아님.
		u.start(); // 스레드 시작 - JVM이 run()을 호출
		
		//CPU환경은 다르므로 실행시마다 바뀔 수 있음.
		//main이 끝나도 프로그램이 죽지 않는다. -> main은 시작만 가능. -> 프로그램이 죽으려면 모든 독립된 스레드가 죽어야함..
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("메인-"+i);
				Thread.sleep(100); // 100ms 쉬라는 명령. 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main end!!!");
	}
}


// 쓰레드를 만드는 첫번째 방법 ==> 다중상속이 불가능 함으로 다중상속 필요시 Runnable이용.
// 1. Thread 클래스를 상속받아 run() 메소드를 재정의 한다.
// 2. Thread 클래스를 상속받은 클래스의 객체를 생성하여 start() 메소드를 호출한다.
class User2 extends Thread{

	@Override
	public void run() {
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("스레드-"+i);
				
				sleep(200); //아버지가 Thread여서 sleep그냥 쓸 수 있음
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

