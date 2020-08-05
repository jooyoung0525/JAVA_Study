package ex0805;

import java.util.Scanner;

//3. 이메일에서 도메인과 아이디를 나누어 반환.
public class API_StringBuffer_Quiz4_SplitIdDomain {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String e;
		System.out.print("이메일을 입력하세요. =>");
		e = sc.next();
		
		
		String result[] = splitDomain(e);
		
		System.out.print("ID: "+result[0]+ "\tDomain: "+result[1]);
		
		System.out.println();
		
		sc.close();
	}
	
	
	
	public static String[] splitDomain(String email) {
		
		String Em[] = new String[2];
		
		Em = email.split("@");
		return Em;
	}
}
