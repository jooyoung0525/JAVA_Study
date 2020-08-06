package ex0722_Operator;

import java.util.Scanner;

public class Conditional_Operators1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		//정수를 입력 받아 짝수인지 홀수인지 판별
		System.out.print("정수 ?");
		a =sc.nextInt();
		s = a%2 == 0 ?  "짝수"  : "홀수";
		
		System.out.println(a + "->"+s);
		sc.close();
	}
}
