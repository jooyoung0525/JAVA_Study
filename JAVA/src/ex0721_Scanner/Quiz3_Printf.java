package ex0721_Scanner;

import java.util.Scanner;

public class Quiz3_Printf {
	public static void main(String[] args) {
		// ������ �Է¹޾� �Է¹��� ������ 16������ �Է¹��� ������ �ش��ϴ�(ASCII �ڵ�)���ڸ� ����Ͻÿ�.
		// ��, �Է� ���� ������ 0~65535 ��� �����Ͽ� ������ �ذ��Ѵ�.
		/*
		 ���� ? 65
		 65 0x41 A
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int Num;
		
		System.out.print("���� ? ");
		Num = sc.nextInt();
		
		//Ǯ��1
		System.out.printf("%d %#x %c\n",Num,Num,Num); //#������ ���� �տ� ����ǥ�� ����
		
		//Ǯ��2
		System.out.printf("%1$d %1$#x %1$c\n",Num);

		sc.close();
	}
}
