package ex0805;

import java.util.Scanner;


//������ �Է¹޾� ���������� ��ȯ
public class API_StringBuffer_Quiz3_ReverseNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("������ ���� �Է��ϼ���. => ");
		s = sc.next();
		
		
		String result = reverseN(s);
		System.out.print("������ �� => ");
		System.out.println(result);
		
		sc.close();
	}
	
	
	public static String reverseN(String ss) {
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<ss.length(); i++)
			sb.insert(0, ss.charAt(i));
		
		
		return sb.toString();
	}
}
