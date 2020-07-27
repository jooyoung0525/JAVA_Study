package ex0727;

import java.util.Scanner;

public class For_Quiz9_pdf6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력 하세요...");
		
		int min = 987654321;
		
		for(int i = 0; i<10; i++)
		{
			int num;
			num = sc.nextInt();
			
			if(min >= num) min = num;
		}
		
		System.out.println("최소값 : "+min);
		
		sc.close();
	}
}
