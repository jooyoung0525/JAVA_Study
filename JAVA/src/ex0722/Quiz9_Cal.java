package ex0722;

import java.util.Scanner;

public class Quiz9_Cal {
	public static void main(String[] args) {
	
		/*
		 * �ݾװ� �Ⱓ(��)�� �Է� �޾� ���ݰ� ���ڸ� ���.
		 * �ݾװ� �Ⱓ�� ������ �Է� ������, ������ �� 2%�̴�.
		 * ��, ����+���ڴ� ���� �ڸ����� ������.
		 * 
		 *  �ݾ� ? 10000000
		 *  �Ⱓ(��) ? 2
		 *  �ѱݾ�(����+����) = xxxxxx
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int money, year, origin;
		
		System.out.print("�ݾ� ? ");
		money = sc.nextInt();
		
		System.out.print("�Ⱓ(��) ? ");
		year = sc.nextInt();
		
		origin = (int)(money * year * 1.02);
		
		//���� �ڸ� ����
		origin = origin / 10 * 10;
		
		System.out.println("�ѱݾ�(����+����) " + origin);
		
		sc.close();
	}
}
