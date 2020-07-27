package ex0727;

import java.util.Scanner;

public class DoWhile_ex3 {
	public static void main(String[] args) {
		//1~9사이의 수를 입력 받아 입력 받은 수의 구구단 출력
		//단, 입력 받은 수가 1~9사이의 수가 아니면 다시 입력 받는다.
		
		//단?10
		//단?3
		//3*1 = 3 ...
		
		int dan,n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//do ~ while 이용
		/*
		do {
			System.out.println("단? ");
			dan = sc.nextInt();
		}while(dan < 1 || dan > 9);*/
		
		
		//while 이용
		System.out.println("단? ");
		dan = sc.nextInt();
		while(dan<1 || dan> 9)
		{
			System.out.println("단? ");
			dan=sc.nextInt();
		}
		
		
		n = 0;
		while(n<9) {
			n++;
			System.out.printf("%d * %d = %d\n",dan,n,dan*n);
		}
		
		sc.close();
		
	}
}
