package ex0729;

import java.util.Scanner;

public class Array_Quiz2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 5���� ������ �Է� �޾�
		// �Է� �������� ������(��-���)�� ����ϰ�
		// �������� ���հ� ����� ���
		
		int score[] =new int[5];
		int ave, tot;
		
		ave = tot = 0;
		System.out.print("5���� ���� �Է�...");
		for(int i = 0; i<score.length; i++)
		{
			score[i] = sc.nextInt();
			tot += score[i];
		}
		
		ave = tot / score.length;
		
		System.out.println("�������");
		for(int i : score)
			System.out.println(i+" "+(i-ave));
		
		System.out.println("�� : "+ tot);
		System.out.println("��� : "+ ave);
		
		sc.close();
	}
}
