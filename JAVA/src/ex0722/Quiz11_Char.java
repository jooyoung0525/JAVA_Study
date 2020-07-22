package ex0722;

import java.util.Scanner;

public class Quiz11_Char {
	public static void main(String[] args) {
		/*
		 * 한 문자를 입력 받아 입력 받은 문자가 소문자이면 대문자로 변환하고,대문자이면 소문자로 변환한다.
		 * 단, 입력 받은 문자가 영문자가 아니면 입력받은 문자를 그대로 출력한다.
		 * 
		 * 한문자 ? a
		 * a -> A
		 * 
		 * 한 문자 ? 7
		 * 7 -> 7
		 * 
		 * 소문자와 대문자의 ASCII코드 차이는 32이다.
		 * */
		Scanner sc = new Scanner(System.in);
		char a,b;
		int anum;
		
		System.out.print("한문자 ? ");
		a = sc.next().charAt(0);
		
		anum = a;
		b = anum >=65 && anum <= 91 ? (char)(anum+32) : ((anum >=97 && anum <=123) ? (char)(anum-32) : a);
		//b = a >='A' && a <= 'Z' ? (char)(a+32) : ((a >= 'a' && a <= 'z') ? (char)(a-32) : a);
		
		System.out.println(a+" -> "+b);
		sc.close();
	}
}
