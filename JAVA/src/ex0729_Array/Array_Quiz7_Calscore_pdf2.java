package ex0729_Array;

import java.util.Scanner;

public class Array_Quiz7_Calscore_pdf2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[5];
		int max,min;
		int total = 0;
		
		//5���� ������ �Է� �����鼭 
		//���� ����Ѵ�.
		//���� �ִ� ������ �ּ� ������ �Բ� ����Ѵ�.
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		System.out.println("5���� ���� �Է�...");
		for(int i = 0; i<score.length;i++)
		{
			
			do {
				System.out.print((i+1)+"��° ����? ");
				score[i] = sc.nextInt();
			}while(score[i]<0||score[i]>10);
			
			total += score[i];
			if(max < score[i]) max = score[i];
			else if(min > score[i]) min = score[i];
		}
		
		System.out.print("���� ����Ʈ : ");
		for(int a:score)
			System.out.print(a+" ");
		System.out.println("\n��� ���� : "+ (total-max-min));
		sc.close();
	}
}
