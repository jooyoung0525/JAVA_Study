package ex0722_Operator;

import java.util.Scanner;

public class Quiz3_Rectangular {
	public static void main(String[] args) {
		//���ο� ���� ���̸� �Է� �޾� �簢���� ���̿� �ѷ� ���
		//���� = �� * ��   , �ѷ� = (�� + ��) *2
		/*
		 * ���� ? 10
		 * ���� ? 5
		 * ���� : 5
		 * �ѷ� : 30
		 */
		
		int Ver, Hor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ?");
		Hor = sc.nextInt();
		
		System.out.println("���� ?");
		Ver = sc.nextInt();
		
		System.out.printf("���� : %d\n", Hor * Ver);
		System.out.printf("�ѷ� : %d\n", (Hor + Ver)*2);
		
		sc.close();
	}
}
