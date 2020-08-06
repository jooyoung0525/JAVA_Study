package ex0729_Array;

import java.util.Scanner;

public class Array_Quiz7_Calscore_pdf2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score[] = new int[5];
		int max,min;
		int total = 0;
		
		//5개의 점수를 입력 받으면서 
		//합을 계산한다.
		//또한 최대 점수와 최소 점수도 함께 계산한다.
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		System.out.println("5개의 점수 입력...");
		for(int i = 0; i<score.length;i++)
		{
			
			do {
				System.out.print((i+1)+"번째 정수? ");
				score[i] = sc.nextInt();
			}while(score[i]<0||score[i]>10);
			
			total += score[i];
			if(max < score[i]) max = score[i];
			else if(min > score[i]) min = score[i];
		}
		
		System.out.print("점수 리스트 : ");
		for(int a:score)
			System.out.print(a+" ");
		System.out.println("\n취득 점수 : "+ (total-max-min));
		sc.close();
	}
}
