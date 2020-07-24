package ex0724;

import java.util.Scanner;

public class Quiz2_Operator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int a,b;
		char oper;
		
		System.out.print("두수? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.print("연산자[+. -, *, /] ? ");
		oper = sc.next().charAt(0);
		
		switch(oper) {
		case '+': System.out.println(a+"+"+b+"="+(a+b)); break;
		case '-': System.out.println(a+"-"+b+"="+(a-b)); break;
		case '*': System.out.println(a+"*"+b+"="+(a*b)); break;
		case '/': System.out.println(a+"/"+b+"="+(a/b)); 
		}
		
		
		/*
		 * print 여러 번 안하는 방법
		 * int result;
		 * switch(oper) {
			case '+': result = a+b; break;
			case '-': result = a-b; break;
			case '*': result = a*b; break;
			case '/': result = a/b; break;
			default : System.out.println("연산자 오류..");
		 }
		 System.out.println(a+oper+b+"="+result);
		 */
		sc.close();
	}

}
