package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class While_Quiz4_040302pdf4 {
	public static void main(String[] args) {		
		//개수를 입력 받아 0부터 입력 받은 개수만큼 피보나치수열을 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int N,n,a,b,c;
		System.out.print("개수 ? ");
		N=sc.nextInt();
		
		n = 0; a = 0; b = 1;
		
		while(n<N) {
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
			n++;
		}
		
		sc.close();
	}
}
