package ex0724;

import java.util.Scanner;

public class While_Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s,n;
		 
		//1*2*..*10狼 搬苞 (10!)
		
		/* 规过1.
		s = 1; n = 1;
		while(true) {
			s*=n;
			n++;
			if(n>=11)break;
		}
		
		System.out.println(s); //3628800
		*/
		
		// 规过2
		s = 1; n = 1;
		while(n<11) {
			s*=n;
			n++;
		}
		
		System.out.println(s);
	
		
		
		sc.close();
	}
}
