package ex0722;

import java.util.Scanner;

public class Quiz6_LeadTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,speed;
		int hour, min;
		double sec;
		double time;
		
		System.out.print("����Ÿ� (KM) ?");
		a = sc.nextInt();
		System.out.print("�ü� (KM/H) ?");
		speed = sc.nextInt();
		
		
		time = (double)a/speed*3600; //-> 3.x�ð��� �����µ� �ʷ� ����ϴ°� ����
		hour = (int)(time / 3600);
		time = time -(hour*3600);
		min = (int)(time / 60);
		sec = time - (min*60);
		
		System.out.printf("%d�ð� %d�� %.2f�� �ҿ�\n",hour,min,sec);
		
		sc.close();
	}
}
