package ex0727;

import java.util.Scanner;

public class For_Quiz5_pdf2 {
	public static void main(String[] args) {
		//수를 입력받아 해당 구구단을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("단 ? ");
		num=sc.nextInt();
		
		for(int i = 1; i<=9; i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
		sc.close();
	}
}
