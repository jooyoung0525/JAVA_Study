package ex0724_Switch;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c;
		
		System.out.println("�ѹ���?");
		c = sc.next().charAt(0);
		
		
		switch(c) {
		case '0':case '1':case '2': case '3': case '4':
		case '5': case '6': case '7': case '8': case '9': System.out.println("����"); break;
		default: System.out.println("���ھƴ�");break;
		}
	
		sc.close();
	}
}
