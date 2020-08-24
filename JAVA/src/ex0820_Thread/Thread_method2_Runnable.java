package ex0820_Thread;

public class Thread_method2_Runnable {
	public static void main(String[] args) {
		User3 us = new User3();
		Thread t = new Thread(us); // 2-1)
		
		t.start(); // 3) ������ ����
	
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("����-"+i);
				Thread.sleep(100);
			}
			System.out.println("main-end...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


// �����带 ����� �ι�° ���
// 1. Runnable �������̽��� ������ Ŭ������ �����.
// 2. run�޼ҵ带 ������ �Ѵ�. 
//    2-1) Thread ��ü�� �����ϸ鼭 1) Ŭ������ ��ü�� �����Ͽ� Thread�����ڿ� �μ��� �ѱ��.
// 3. 2-1)���� ������ Thread Ŭ���� ��ü�� start() �޼ҵ� ȣ��
class User3 implements Runnable{

	@Override
	public void run() {
		
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("������-"+i);
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}

