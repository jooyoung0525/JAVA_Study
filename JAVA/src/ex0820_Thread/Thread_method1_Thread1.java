package ex0820_Thread;

public class Thread_method1_Thread1 {
	public static void main(String[] args) {

		User2 u = new User2();
		
		//u.run(); // run()�� ȣ���ϸ� �����尡 �ƴ�.
		u.start(); // ������ ���� - JVM�� run()�� ȣ��
		
		//CPUȯ���� �ٸ��Ƿ� ����ø��� �ٲ� �� ����.
		//main�� ������ ���α׷��� ���� �ʴ´�. -> main�� ���۸� ����. -> ���α׷��� �������� ��� ������ �����尡 �׾����..
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("����-"+i);
				Thread.sleep(100); // 100ms ����� ���. 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main end!!!");
	}
}


// �����带 ����� ù��° ��� ==> ���߻���� �Ұ��� ������ ���߻�� �ʿ�� Runnable�̿�.
// 1. Thread Ŭ������ ��ӹ޾� run() �޼ҵ带 ������ �Ѵ�.
// 2. Thread Ŭ������ ��ӹ��� Ŭ������ ��ü�� �����Ͽ� start() �޼ҵ带 ȣ���Ѵ�.
class User2 extends Thread{

	@Override
	public void run() {
		try {
			for(int i = 1; i<=10; i++) {
				System.out.println("������-"+i);
				
				sleep(200); //�ƹ����� Thread���� sleep�׳� �� �� ����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

