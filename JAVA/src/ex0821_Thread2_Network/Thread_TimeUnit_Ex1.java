package ex0821_Thread2_Network;

import java.util.concurrent.TimeUnit;

public class Thread_TimeUnit_Ex1 {

	public static void main(String[] args) {
		try {
			long s = System.nanoTime();
			
			//1�ʸ� ��Ÿ���� ������
			TimeUnit.SECONDS.sleep(1L); // 1second
			TimeUnit.MILLISECONDS.sleep(1000L); //
			TimeUnit.MICROSECONDS.sleep(1000000L); // 10�� -6��
			TimeUnit.NANOSECONDS.sleep(1000000000L); // 10�� -9��
			
			
			long e = System.nanoTime();
			System.out.println("sleep:"+(e-s)+" ns");
			System.out.println("sleep:"+((e-s)/1000000000)+" s");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
