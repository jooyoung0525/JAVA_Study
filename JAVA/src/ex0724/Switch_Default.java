package ex0724;

import java.util.Scanner;

public class Switch_Default {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("����?");
		n = sc.nextInt();

		switch (n) {
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("##");
			break;
		case 1:
			System.out.println("$");
			break;
		default:
			System.out.println("�Է¿���..");
			break; // ���� ������ case������ ����ŵ� ������� �ʾ��� ��, default --> �� ������ ��ġ�� �־���ϴ� �� �ƴ�, ��ġ�� �߿����� ������ break�� �Ἥ ��������� ��!
		}

		sc.close();
	}
}
