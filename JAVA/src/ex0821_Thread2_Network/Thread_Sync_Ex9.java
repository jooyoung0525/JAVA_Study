package ex0821_Thread2_Network;

public class Thread_Sync_Ex9 {

	public static void main(String[] args) {
		ShareData sd = new ShareData();
		
		UpThread t1 =new UpThread(sd,"up");
		DownThread t2 =new DownThread(sd,"down");
		t1.start();
		t2.start();
	}

}

//동기화
class ShareData { 
	private int value = 100;
	public synchronized void up(String title) {
		System.out.print(title+":"+value);
		value++;
		System.out.println(", 증가:"+value);
	}
	public synchronized void down(String title) {
		System.out.print(title+":"+value);
		value--;
		System.out.println(", 감소:"+value);
	}
}
class UpThread extends Thread{
	private ShareData share;
	private String title;
	
	public UpThread(ShareData share, String title) {
		this.share = share;
		this.title= title;
		
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(500);
				share.up(title);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
class DownThread extends Thread{
	private ShareData share;
	private String title;
	
	public DownThread(ShareData share, String title) {
		this.share = share;
		this.title= title;
		
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				sleep(500);
				share.down(title);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}