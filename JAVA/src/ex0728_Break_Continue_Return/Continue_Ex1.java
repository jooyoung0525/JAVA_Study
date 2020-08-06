package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class Continue_Ex1 {
	public static void main(String[] args) {
		//10개의 수를 입력 받아 입력 받은 수의 합 구하기
		//단, 입력 받은 수가 0이하면 합에 누적하지 않는다.
		
		Scanner sc = new Scanner(System.in);
		int n,s;
		
		s = 0;
		
		System.out.println("10개의 수 입력");
		for(int i = 1; i<=10; i++)
		{
			n = sc.nextInt();
			if(n <= 0)continue;
			s+=n;
		}
		System.out.println("결과 : " + s);
		
		sc.close();
	}
}
