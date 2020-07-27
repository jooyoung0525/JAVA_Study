package ex0727;

import java.util.Scanner;

public class For_Quiz1 {
	public static void main(String[] args) {
		//정수를 입력 받아 입력 받은 수까지 홀수 합 구하기
		//단 입력 받은 수가 1보다 적으면 다시 입력 받는다.
		
		Scanner sc = new Scanner(System.in);
		
		int n,hap;
	
		do {
			System.out.print("정수?");
			n = sc.nextInt();
		}while(n<1);
		
		hap=0;
		for(int i = 1; i<=n; i+=2)
		{
			hap+=i;
		}
		
		System.out.println("홀수 합: " + hap);
		
		sc.close();
	}
}
