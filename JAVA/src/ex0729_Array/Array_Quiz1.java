package ex0729_Array;

import java.util.Scanner;

public class Array_Quiz1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];
		int[] score = new int[5];
		int tot,ave;
		
		tot = 0;
		for(int i = 0; i<name.length; i++)
		{
			System.out.print((i+1)+"번째 이름 ? ");
			name[i] = sc.nextLine(); //공백 허용해서 입력받기
			
			System.out.print("     점수 ? ");
			score[i] = sc.nextInt();
			sc.nextLine(); //공백버림
			
			tot+=score[i];
		}
		
		ave = tot/score.length;
		
		int s;
		System.out.println("\n이름\t점수\t편차");
		System.out.println("---------------");
		for(int i = 0; i<name.length; i++) {
			s = score[i]-ave;
			System.out.println(name[i]+"\t"+score[i]+"\t"+s);
		}
		System.out.println("---------------");
		System.out.println("총합 : "+tot);
		System.out.println("---------------");
		System.out.println("평균 : "+ave);
		System.out.println("---------------");
		sc.close();
	}
}
