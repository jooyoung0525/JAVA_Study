package ex0722;

import java.util.Scanner;

public class Quiz2_Time {
	public static void main(String[] args) {
		
		int Time, Hour, Min, InitT;
		//60초 = 1분
		Scanner sc = new Scanner(System.in);
				
		System.out.println("초 ?");
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
		
		System.out.printf("%d 초는 %d시간 %d분 %d초입니다.",InitT,Hour,Min,Time);
		sc.close();
	}
}
