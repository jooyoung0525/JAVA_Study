package ex0805_String_StringBuffer_StringBuilder_API;

import java.util.Scanner;


//정수를 입력받아 뒤집은것을 반환
public class API_StringBuffer_Quiz3_ReverseNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("뒤집을 수를 입력하세요. => ");
		s = sc.next();
		
		//StringBuffer sb = new StringBuffer();
		String rev = reverseN(s);
		
		System.out.println(rev);
		//String result = reverseN(s);
		//System.out.print("뒤집힌 수 => ");
		//System.out.println(result);
		
		sc.close();
	}
	
	
	public static String reverseN(String ss) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(ss);
		
		//String a = sb.toString(); // StringBuffer -> String
		//System.out.println(a);
		/*
		for(int i = 0; i<ss.length(); i++)
			sb.insert(0, ss.charAt(i));
		*/
		
		return sb.reverse().toString();
	}
}
