package ex0722;

import java.util.Scanner;

public class Quiz10_Year {
	public static void main(String[] args) {
		
		/*
		 * �⵵�� �Է� �޾� �������� ��������� ���
		 * ���� ��]
		 * �⵵ ? 2020
		 * 2020 -> ����
		 * 
		 * �⵵�� 4�� ����̰� 100�� ����� �ƴϰų� 400�� ����̸� ����(2���� 29��)�̰� �׷��� ������ ����̴�.
		 * 
		 * 2019 : ��� 
		 * 2000 : ����
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int year;
		String ans;
		
		System.out.print("�⵵ ? ");
		year = sc.nextInt();
		
		//ans = (year% 4 == 0) && (year % 400 == 0) ? "����" : ((year % 4 == 0) && (year % 100 != 0) ? "����" : "���");
		ans = (year% 4 == 0) && (year % 100 != 0) || (year % 400 == 0) ? "����" : "���";
		
		System.out.println(year+" -> "+ ans);
		sc.close();
		
	}
}
