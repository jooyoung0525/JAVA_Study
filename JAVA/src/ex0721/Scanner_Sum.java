package ex0721;

import java.util.Scanner;

public class Scanner_Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int c;
		
		System.out.print("�� �� ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a+b;
		
		System.out.printf("%d + %d = %d",a,b,c);
		
		sc.close(); //Scanner ������ �����ָ� ������ �߻��� ���ɼ��� ����
 	}

}
