package ex0724;

import java.util.Scanner;

public class Quiz1_Score {
	public static void main(String[] args) {
		//������ �Է� �޾� �Է� ���� ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		/*
		 * [ó�� ����]
		 * switch�� ���
		 * ������ �Է��� nextInt()���
		 * ������ �Է��� 0~100������ �� �Էµȴٴ� �����Ͽ� �ۼ�
		 * ������ ������ ����.
		 * 90~100 : ��
		 * 80~89  : ��
		 * 70~70  : ��
		 * 60~69  : ��
		 * 0~59   :��
		 * */
		Scanner sc = new Scanner(System.in);

		int score;

		System.out.print("���� ? ");
		score = sc.nextInt();

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("���� : " + score + ", ���� : ��");
			break;
		case 8:
			System.out.println("���� : " + score + ", ���� : ��");
			break;
		case 7:
			System.out.println("���� : " + score + ", ���� : ��");
			break;
		case 6:
			System.out.println("���� : " + score + ", ���� : ��");
			break;
		default:
			System.out.println("���� : " + score + ", ���� : ��");
		}
		sc.close();
	}
}
