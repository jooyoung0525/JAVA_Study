package ex0724_Switch;

import java.util.Scanner;

public class While_Practice2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int s,n,num;
		
		
		System.out.print("정수?");
		num = sc.nextInt();
		
		//1부터 입력 받은 수까지 합구하기
		/*
		s = n = 0;
		while(n<num) {
			n++;
			s+=n;
		}
		System.out.println("1~"+num+" 까지 합: "+s);
		*/
		
		//1부터 입력 받은 수까지 홀수 합 구하기
		s = 0; n = 1;
		while(n<=num) {
			s+=n;
			n+=2;
		}
		
		System.out.println("1~"+num+" 까지의 홀수 합: "+s);
		sc.close();
	}
}
