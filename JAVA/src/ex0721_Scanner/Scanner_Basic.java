package ex0721_Scanner;

import java.util.Scanner;

public class Scanner_Basic {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //��ĳ�� ��ü�� �ν��Ͻ� ����
		//sc��� �ν��Ͻ� �����ϰ� new�� �޸� �Ҵ�
		
		String name; 
		int age;
		char gender;
		double height;
		/*
		 �������� ���� �ϰ� ��� ���ϸ�  !ǥ�� ����
		 */
		
		System.out.print("�̸��� ? ");
		name = sc.next(); //������� ���ڿ� �Է�
		
		System.out.print("���̴� ? ");
		age = sc.nextInt(); //���� �Է�
		
		System.out.print("������ ? [M/F] ");
		gender = sc.next().charAt(0); //�� ���� �Է�
		
		System.out.print("Ű�� ? ");
		height = sc.nextDouble(); //�Ǽ� �Է�
		
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " +age);
		System.out.println("���� : " +gender);
		System.out.println("Ű : " + height);
		
		sc.close();
	}
}
