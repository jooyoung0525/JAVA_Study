package ex0722_Operator;

import java.util.Scanner;

public class Quiz4_Circle {
	public static void main(String[] args) {
		//반지름(정수)를 입력 받아 원 넓이 둘레 계산
		//단, 넓이와 둘레는 소수점 3째자리에서 반올림하여 2자리로 출력
		//넓이 = 반 * 반 * 3.14, 둘레 = 반 * 2 * 3.14
		
		/*
		 * 반지름 ? 10
		 * 넓이 : x.xx
		 * 둘레 : x.xx
		 */
		
		int len;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름 ? ");
		len = sc.nextInt();
		
		System.out.printf("넓이 : %.2f\n", len * len * 3.14);
		System.out.printf("둘레 : %.2f\n", 2 * len * 3.14);
		sc.close();
	}
}
