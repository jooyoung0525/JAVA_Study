package ex0722_Operator;

import java.util.Scanner;

public class Quiz3_Rectangular {
	public static void main(String[] args) {
		//가로와 세로 길이를 입력 받아 사각형의 넓이와 둘레 계산
		//넓이 = 가 * 세   , 둘레 = (가 + 세) *2
		/*
		 * 가로 ? 10
		 * 세로 ? 5
		 * 넓이 : 5
		 * 둘레 : 30
		 */
		
		int Ver, Hor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 ?");
		Hor = sc.nextInt();
		
		System.out.println("세로 ?");
		Ver = sc.nextInt();
		
		System.out.printf("넓이 : %d\n", Hor * Ver);
		System.out.printf("둘레 : %d\n", (Hor + Ver)*2);
		
		sc.close();
	}
}
