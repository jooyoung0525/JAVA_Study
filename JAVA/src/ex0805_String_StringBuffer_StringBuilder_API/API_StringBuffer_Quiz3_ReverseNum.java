package ex0805_String_StringBuffer_StringBuilder_API;

import java.util.Scanner;


//������ �Է¹޾� ���������� ��ȯ
public class API_StringBuffer_Quiz3_ReverseNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("������ ���� �Է��ϼ���. => ");
		s = sc.next();
		
		//StringBuffer sb = new StringBuffer();
		String rev = reverseN(s);
		
		System.out.println(rev);
		//String result = reverseN(s);
		//System.out.print("������ �� => ");
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
