package ex0722_Operator;

import java.util.Scanner;

public class Conditional_Operators1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		
		//������ �Է� �޾� ¦������ Ȧ������ �Ǻ�
		System.out.print("���� ?");
		a =sc.nextInt();
		s = a%2 == 0 ?  "¦��"  : "Ȧ��";
		
		System.out.println(a + "->"+s);
		sc.close();
	}
}
