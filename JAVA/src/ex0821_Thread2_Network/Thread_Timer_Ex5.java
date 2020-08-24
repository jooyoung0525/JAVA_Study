package ex0821_Thread2_Network;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Thread_Timer_Ex5 {

	public static void main(String[] args) {
		MyTimer t = new MyTimer();
		t.start();
	}

}
class MyTimer extends Thread{
	private long num =0;
	
	public MyTimer() {
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				
				num=0;
			}
		};
		//시간 12시로 설정
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,1);
		cal.set(Calendar.HOUR_OF_DAY,0);
		cal.set(Calendar.MINUTE,0);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		// 밤 12시마다  num=0;만들기
		Timer timer = new Timer();
		timer.schedule(task, cal.getTime(), 1000*60*60*24);
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("num->"+(++num));
				sleep(1000);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}