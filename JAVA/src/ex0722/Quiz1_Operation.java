package ex0722;

import java.util.Scanner;

public class Quiz1_Operation {
	public static void main(String[] args) {
		//�μ��� �Է� �޾� ��Ģ ������ ���
		/*
		 * ��� ���� 
		 * �μ�? 10 5 
		 * 10 + 5 = 15 10 - 5 = 5 
		 * 10 * 5 = 50 10 / 5 = 2
		 */
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ� ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d  %d - %d = %d\n",a,b,(a+b),a,b,(a-b));
		System.out.printf("%d * %d = %d  %d / %d = %d\n",a,b,(a*b),a,b,(a/b));
		
		sc.close();
	}
}
