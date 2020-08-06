package ex0722_Operator;

import java.util.Scanner;

public class Conditional_Operators2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		//정수를 입력 받아 절대값 구하기
		System.out.print("정수 ?");
		a =sc.nextInt();
		b = a > 0? a: -a;
		
		System.out.println(a +" 절대값 :"+b);
		sc.close();
	}
}
