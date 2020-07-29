package ex0729;

import java.util.Scanner;

public class Array_Quiz2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 5개의 정수를 입력 받아
		// 입력 받은수와 각편차(수-평균)을 출력하고
		// 마지막에 총합과 평균을 출력
		
		int score[] =new int[5];
		int ave, tot;
		
		ave = tot = 0;
		System.out.print("5개의 정수 입력...");
		for(int i = 0; i<score.length; i++)
		{
			score[i] = sc.nextInt();
			tot += score[i];
		}
		
		ave = tot / score.length;
		
		System.out.println("편차출력");
		for(int i : score)
			System.out.println(i+" "+(i-ave));
		
		System.out.println("합 : "+ tot);
		System.out.println("평균 : "+ ave);
		
		sc.close();
	}
}
