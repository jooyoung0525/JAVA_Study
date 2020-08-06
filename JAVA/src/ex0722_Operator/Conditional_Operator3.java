package ex0722_Operator;

import java.util.Scanner;

public class Conditional_Operator3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		System.out.print("정수 ? ");
		a = sc.nextInt();
		s = a>0?"양수":(a<0?"음수":"영");

		System.out.println(a +" -> "+s);
		sc.close();
	}
}
