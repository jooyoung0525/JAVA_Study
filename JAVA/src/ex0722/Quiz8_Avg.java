package ex0722;

import java.util.Scanner;

public class Quiz8_Avg {
	public static void main(String[] args) {
		/*
		 * �̸�, ������ ������ �Է� �޾� ������ ��� ���
		 * ��, ����� �Ҽ��� ù°�ڸ����� �ݿø��Ͽ� ���
		 * 
		 * �̸� ? ȫ�浿
		 * ������ ���� ? 100 100 100
		 * ȫ�浿���� ������ 300, ����� 100�Դϴ�.
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int one,two,three, hap;
		double avg;

		System.out.print("�̸� ?");
		name = sc.next();
		
		System.out.print("������ ���� ?");
		one = sc.nextInt();
		two = sc.nextInt();
		three = sc.nextInt();
		
		hap = one+two+three;
		avg = (hap / 3 )+ 0.5; //�ݿø� ����
		
		System.out.printf("%s���� ������ %d, ����� %.0f�Դϴ�.",name,hap,avg); //.0f ==> �Ҽ��� ù°�ڸ����� �ݿø�
		
		sc.close();
	}

}
