package ex0722_Operator;

import java.util.Scanner;

public class Quiz4_Circle {
	public static void main(String[] args) {
		//������(����)�� �Է� �޾� �� ���� �ѷ� ���
		//��, ���̿� �ѷ��� �Ҽ��� 3°�ڸ����� �ݿø��Ͽ� 2�ڸ��� ���
		//���� = �� * �� * 3.14, �ѷ� = �� * 2 * 3.14
		
		/*
		 * ������ ? 10
		 * ���� : x.xx
		 * �ѷ� : x.xx
		 */
		
		int len;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ? ");
		len = sc.nextInt();
		
		System.out.printf("���� : %.2f\n", len * len * 3.14);
		System.out.printf("�ѷ� : %.2f\n", 2 * len * 3.14);
		sc.close();
	}
}
