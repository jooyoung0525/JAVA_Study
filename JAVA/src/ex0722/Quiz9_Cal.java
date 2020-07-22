package ex0722;

import java.util.Scanner;

public class Quiz9_Cal {
	public static void main(String[] args) {
	
		/*
		 * 금액과 기간(년)을 입력 받아 원금과 이자를 계산.
		 * 금액과 기간은 정수로 입력 받으며, 이율은 년 2%이다.
		 * 단, 원금+이자는 일의 자리에서 버린다.
		 * 
		 *  금액 ? 10000000
		 *  기간(년) ? 2
		 *  총금액(원금+이자) = xxxxxx
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int money, year, origin;
		
		System.out.print("금액 ? ");
		money = sc.nextInt();
		
		System.out.print("기간(년) ? ");
		year = sc.nextInt();
		
		origin = (int)(money * year * 1.02);
		
		//일의 자리 절삭
		origin = origin / 10 * 10;
		
		System.out.println("총금액(원금+이자) " + origin);
		
		sc.close();
	}
}
