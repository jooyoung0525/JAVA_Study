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
//		t.stop(); // "������ ����" �� ��µ��� �ʴ´�. ���� stop ��� ����..
		t.interrupt();
		// ���ͷ�Ʈ�� ���� �����尡 sleep() , wait(), join() ������ ���
		// InterruptedException �߻�
		System.out.println("���� ����...");
	}
}

class MyThread3 implements Runnable{

	@Override
	public void run() {
		long n =0;
		try {
			while(true) {
				n++;
				System.out.println("������-"+n);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("���ͷ�Ʈ ��");
		}
		System.out.println("������ ����...");
		
	}
	
}