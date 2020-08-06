package ex0724_Switch;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.println("한문자?");
		c = sc.next().charAt(0);
		
		
		switch(c) {
		case '0':case '1':case '2': case '3': case '4':
		case '5': case '6': case '7': case '8': case '9': System.out.println("숫자"); break;
		default: System.out.println("숫자아님");break;
		}
	
		sc.close();
	}
}
