package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class Return_Ex1 {
	public static void main(String[] args) {
		//어떤수를 입력 받아 입력 받은 수까지 합 구하기
		//입력 받은 수가 0보다 적거나 같으면 종료
		
		Scanner sc = new Scanner(System.in);
		int n,s;
		
		System.out.print("수?");
		n = sc.nextInt();
		
		/*
		// 방법1
		if(n>0) {
			s = 0;
			for(int i = 1; i<=n; i++) {
				s+=i;
			}
			System.out.println("결과 : "+s);	
		}*/
		
		//방법2
		if(n<=0) {
			sc.close();
			return; //thread를 죽이는 것이 아니기 때문에 프로그램을 죽이는건 아님.
		}
		
		s = 0;
		for(int i = 1; i<=n; i++) {
			s+=i;
		}
		System.out.println("결과 : "+s);	
		
		
		sc.close();
	}
}
