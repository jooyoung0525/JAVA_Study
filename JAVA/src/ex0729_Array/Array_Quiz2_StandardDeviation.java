package ex0729_Array;

import java.util.Scanner;

public class Array_Quiz2_StandardDeviation {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 5���� ������ �Է� �޾�
		// �Է� �������� ������(��-���)�� ����ϰ�
		// �������� ���հ� ����� ���
		
		int score[] =new int[5];
		int avg, tot;
		
		avg = tot = 0;
		System.out.print("5���� ���� �Է�...");
		for(int i = 0; i<score.length; i++)
		{
			score[i] = sc.nextInt();
			tot += score[i];
		}
		
		avg = tot / score.length;
		
		System.out.println("�������");
		for(int i : score)
			System.out.println(i+" "+(i-avg));
		
		System.out.println("�� : "+ tot);
		System.out.println("��� : "+ avg);
		
		sc.close();
	}
}
