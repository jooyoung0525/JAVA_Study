package ex0821_Thread2_Network;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Thread_Timer_Ex6 {
	public static void main(String[] args) {
		TimerTest tt = new TimerTest();
	}
}
class TimerTest {
	public TimerTest() {
//		TimerTask :Ÿ�̸ӿ� ���� 1ȸ �Ǵ� ������ �ݺ������� �½�ũ
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				printTime();
			}
		};
		Timer t = new Timer();
//		t.schedule(task, 1000); 1���� �ѹ�
//		t.schedule(task, 2000,1000); //2���ĺ��� ������ 1�ʸ��� �ݺ� 
		t.schedule(task,new Date(),1000);
	}
	
	private void printTime() {
	Calendar cal = Calendar.getInstance();
	
	int y = cal.get(Calendar.YEAR);
	int m = cal.get(Calendar.MONTH)+1;
	int d = cal.get(Calendar.DATE);
	int h = cal.get(Calendar.HOUR);
	int mi = cal.get(Calendar.MINUTE);
	int s = cal.get(Calendar.SECOND);
	
	String str= String.format("%d-%02d-%02d %02d:%02d:%02d", y,m,d,h,mi,s);
	System.out.println(str);
	}
}