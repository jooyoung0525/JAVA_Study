package ex0722;

import java.util.Scanner;

public class Quiz2_Time {
	public static void main(String[] args) {
		
		int Time, Hour, Min, InitT;
		//60�� = 1��
		Scanner sc = new Scanner(System.in);
				
		System.out.println("�� ?");
		InitT = sc.nextInt();
		
		Time = InitT;
		
		Hour = Time / 3600;
		Time = Time - (Hour*3600);
		
		Min = Time / 60;
		Time = Time - (Min*60); 
		
		/*
		 * h = a/3600
		 * m = (a/60)%60
		 * s = a%60
		 * */
		
		System.out.printf("%d �ʴ� %d�ð� %d�� %d���Դϴ�.",InitT,Hour,Min,Time);
		sc.close();
	}
}
