package ex0722_Operator;

import java.util.Scanner;

public class Quiz5_Money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("�ݾ� ?");
		a = sc.nextInt();
		
		System.out.println("5������: "+(a/50000));
		System.out.println("������: "+ ((a%50000)/10000));
		System.out.println("��õ����: "+ ((a%10000)/5000));
		System.out.println("õ����: "+ ((a%5000)/1000));
		System.out.println("�������: "+ ((a%1000)/500));
		System.out.println("�����: "+ ((a%500)/100));
		System.out.println("���ʿ���: "+ ((a%100)/50));
		System.out.println("�ʿ���: "+ ((a%50)/10));
		System.out.println("������: "+ ((a%10)/5));
		System.out.println("�Ͽ���: "+ ((a%5)/1));
		sc.close();
	}
}
