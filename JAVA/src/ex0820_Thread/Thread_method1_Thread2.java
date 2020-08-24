package ex0820_Thread;

/*
 - ���� ������
     ���� �����尡 ����Ǿ ���� �������� �۾��� �Ϸ���� ������ ���α׷��� ������� �ʴ´�.
     ��, ��� �����尡 ����Ǿ�� ���α׷��� ����ȴ�.
     
 - ���� ������
     �ٸ� �����忡 ������ �ִ� ������
     ���� �����尡 ����Ǹ� ���� �����尡 ������� �ʾƵ� ���α׷��� ����ȴ�.
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
			t1.join(); //�ٸ� �����尡 ����ɶ� ���� ���. ->main�� ������� ������ 3�� ����.
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
				System.out.println(getName()+":"+i); //getName : �������̸� �˷���.
				
				sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}

