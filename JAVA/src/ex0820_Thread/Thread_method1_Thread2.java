package ex0820_Thread;

/*
 - 독립 스레드
     메인 스레드가 종료되어도 독립 스레드의 작업이 완료되지 않으면 프로그램이 종료되지 않는다.
     즉, 모든 스레드가 종료되어야 프로그램이 종료된다.
     
 - 데몬 스레드
     다른 스레드에 도움을 주는 스레드
     메인 스레드가 종료되면 데몬 스레드가 종료되지 않아도 프로그램은 종료된다.
 */
public class Thread_method1_Thread2 {
	public static void main(String[] args) {
		User5 t1 = new User5();
		User5 t2 = new User5();
		User5 t3 = new User5();
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join(); //다른 스레드가 종료될때 까지 대기. ->main은 멈춰놓고 스레드 3개 돌림.
			//t2.join();
			//t3.join();

		} catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("main-end...");
	}
}


class User5 extends Thread{

	@Override
	public void run() {
		
		try {
			for(int i = 1; i<=20; i++) {
				System.out.println(getName()+":"+i); //getName : 스레드이름 알려줌.
				
				sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}

