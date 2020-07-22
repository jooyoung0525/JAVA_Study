package ex0721;

import java.util.Scanner;

public class Quiz1_ASCII {
	public static void main(String[] args) {
		//한 문자를 입력 받아 입력 받은 문자의 ASCII 코드 값 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		char ch; int num;
		 
		
		System.out.print("한문자 ? ");
		ch = sc.next().charAt(0);
		
		//방법1
		num = ch;
		System.out.printf("%c -> %d\n",ch,num);
		
		//방법2
		System.out.printf("%c -> %d\n",ch,(int)ch);
		
		sc.close();
	}
}
