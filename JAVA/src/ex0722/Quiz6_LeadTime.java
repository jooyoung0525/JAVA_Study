package ex0722;

import java.util.Scanner;

public class Quiz6_LeadTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,speed;
		int hour, min;
		double sec;
		double time;
		
		System.out.print("주행거리 (KM) ?");
		a = sc.nextInt();
		System.out.print("시속 (KM/H) ?");
		speed = sc.nextInt();
		
		
		time = (double)a/speed*3600; //-> 3.x시간이 나오는데 초로 계산하는게 편함
		hour = (int)(time / 3600);
		time = time -(hour*3600);
		min = (int)(time / 60);
		sec = time - (min*60);
		
		System.out.printf("%d시간 %d분 %.2f초 소요\n",hour,min,sec);
		
		sc.close();
	}
}
