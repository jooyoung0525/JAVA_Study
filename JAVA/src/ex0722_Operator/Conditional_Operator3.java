package ex0722_Operator;

import java.util.Scanner;

public class Conditional_Operator3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		System.out.print("���� ? ");
		a = sc.nextInt();
		s = a>0?"���":(a<0?"����":"��");

		System.out.println(a +" -> "+s);
		sc.close();
	}
}
