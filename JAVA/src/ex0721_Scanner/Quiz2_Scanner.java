package ex0721_Scanner;

import java.util.Scanner;

public class Quiz2_Scanner {
	public static void main(String[] args) {
		
		//�̸��� ���� ���� ������ �Է� �޾� ���� ���ϱ�
		//����� println ��� �� ��.
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int Korean, English;
		
		System.out.print("�̸� ? ");
		name = sc.next();
		
		System.out.print("���� ? ");
		Korean = sc.nextInt();
		
		System.out.print("���� ? ");
		English = sc.nextInt();
		
		System.out.println(name+"���� ������ "+(Korean+English)+"���Դϴ�.");
		
		sc.close();
	}

}
