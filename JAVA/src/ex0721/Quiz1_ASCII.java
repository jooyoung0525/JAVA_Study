package ex0721;

import java.util.Scanner;

public class Quiz1_ASCII {
	public static void main(String[] args) {
		//�� ���ڸ� �Է� �޾� �Է� ���� ������ ASCII �ڵ� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		
		char ch; int num;
		 
		
		System.out.print("�ѹ��� ? ");
		ch = sc.next().charAt(0);
		
		//���1
		num = ch;
		System.out.printf("%c -> %d\n",ch,num);
		
		//���2
		System.out.printf("%c -> %d\n",ch,(int)ch);
		
		sc.close();
	}
}
