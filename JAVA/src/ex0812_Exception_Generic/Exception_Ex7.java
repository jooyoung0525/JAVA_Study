package ex0812_Exception_Generic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s, n;
		
		while(true) {
			try {
				System.out.println("수[0:종료]");
				n=sc.nextInt();
				if(n==0) {
					break;
				}
				s =0;
				for(int i =1;i<=n;i++) {
					s+=i;
				}
				System.out.println("결과:"+s);
		}catch(InputMismatchException e){
			System.out.println("수만 입력 가능합니다.");
		}
			
		}
		System.out.println("종료...");
		
		sc.close();//앞으로는 finally 블록에서 처리
	}

}
