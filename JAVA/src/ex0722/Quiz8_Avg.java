package ex0722;

import java.util.Scanner;

public class Quiz8_Avg {
	public static void main(String[] args) {
		/*
		 * 이름, 세과목 점수를 입력 받아 총점과 평균 계산
		 * 단, 평균은 소수점 첫째자리에서 반올림하여 출력
		 * 
		 * 이름 ? 홍길동
		 * 세과목 점수 ? 100 100 100
		 * 홍길동님의 총점은 300, 평균은 100입니다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int one,two,three, hap;
		double avg;

		System.out.print("이름 ?");
		name = sc.next();
		
		System.out.print("세과목 점수 ?");
		one = sc.nextInt();
		two = sc.nextInt();
		three = sc.nextInt();
		
		hap = one+two+three;
		avg = (hap / 3 )+ 0.5; //반올림 연산
		
		System.out.printf("%s님의 총점은 %d, 평균은 %.0f입니다.",name,hap,avg); //.0f ==> 소수점 첫째자리에서 반올림
		
		sc.close();
	}

}
