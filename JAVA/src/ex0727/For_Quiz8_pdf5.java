package ex0727;

import java.util.Scanner;

public class For_Quiz8_pdf5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 정수를 입력 하세요...");
		
		int max = -987654321; //가장 작은수 초기 값 주는 방법
		//방법 1 ) for문 밖에서 입력값을 한번 받고 for안에서 입력9값을 받으면 됨
		
		for(int i = 0; i<10; i++)
		{
			int num;
			num = sc.nextInt();
			
			if(max <= num) max = num;
		}
		
		System.out.println("최대값 : "+max);
		
		
		/*
		 int n,s;
		 n=s =0;
		 while(n<10){
		 	n++;
		 	s+=n;
		 }
		 System.out.println(s);
		 
		 ------------------------------
		 
		 int s;
		 s = 0;
		 for(int i = 1; i<=10; i++)
		 {
		 	s+=n;
		 }
		 System.out.println(s);
		 
		 */
		
		sc.close();
	}
}
