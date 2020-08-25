package ex0825;

import java.util.Calendar;

public class Runnable_Rambda1 {
	public static void main(String[] args) {
		// 1초에 한번씩 시간나오게
		Runnable r = () -> {
			while (true) {
				String s = String.format("%tT", Calendar.getInstance());
				System.out.println(s);

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}

		};
		Thread t = new Thread(r);
		t.start();
	}
}
