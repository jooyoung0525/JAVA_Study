package ex0722;

import java.util.Scanner;

public class Quiz10_Year {
	public static void main(String[] args) {
		
		/*
		 * 년도를 입력 받아 윤년인지 평년인지를 계산
		 * 실행 예]
		 * 년도 ? 2020
		 * 2020 -> 윤년
		 * 
		 * 년도가 4의 배수이고 100의 배수가 아니거나 400의 배수이면 윤년(2월이 29일)이고 그렇지 않으면 평년이다.
		 * 
		 * 2019 : 평년 
		 * 2000 : 윤년
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		String ans;
		
		System.out.print("년도 ? ");
		year = sc.nextInt();
		
		//ans = (year% 4 == 0) && (year % 400 == 0) ? "윤년" : ((year % 4 == 0) && (year % 100 != 0) ? "윤년" : "평년");
		ans = (year% 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "윤년" : "평년";
		
		System.out.println(year+" -> "+ ans);
		sc.close();
		
	}
}
