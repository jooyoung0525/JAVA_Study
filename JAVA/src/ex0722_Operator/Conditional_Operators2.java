package ex0722_Operator;

import java.util.Scanner;

public class Conditional_Operators2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		//������ �Է� �޾� ���밪 ���ϱ�
		System.out.print("���� ?");
		a =sc.nextInt();
		b = a > 0? a: -a;
		
		System.out.println(a +" ���밪 :"+b);
		sc.close();
	}
}
