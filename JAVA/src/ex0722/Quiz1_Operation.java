package ex0722;

import java.util.Scanner;

public class Quiz1_Operation {
	public static void main(String[] args) {
		//두수를 입력 받아 사칙 연산을 계산
		/*
		 * 출력 형식 
		 * 두수? 10 5 
		 * 10 + 5 = 15 10 - 5 = 5 
		 * 10 * 5 = 50 10 / 5 = 2
		 */
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("두수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d  %d - %d = %d\n",a,b,(a+b),a,b,(a-b));
		System.out.printf("%d * %d = %d  %d / %d = %d\n",a,b,(a*b),a,b,(a/b));
		
		sc.close();
	}
}
