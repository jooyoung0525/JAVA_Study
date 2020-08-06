package ex0805_String_StringBuffer_StringBuilder_API;

public class API_Integer {
	public static void main(String[] args) {
		String s1 = "123";
		String s2 = "456";
		String s3;

		s3 = s2 + s1; //문자열 결합
		System.out.println(s3); //456123
		
		
		//문자열을 정수로 변환
		int a = Integer.parseInt(s1); //java.lang에 있어서 import안해도됨
		int b = Integer.parseInt(s2); 
		int c = a+b; 
		System.out.println(c); // 579
		
		//s3 = c; //컴파일 오류. 자료형이 일치하지 않음
		
		//정수를 문자열로 변환
		s3 = Integer.toString(c);
		System.out.println(s3); //579
		
		//정수를 2진수의 문자열로 변환
		s3 = Integer.toBinaryString(c);
		System.out.println(s3); //1001000011
		
	
		// 정수인 string만 숫자로 변경가능
		//s3 ="1,123";
		//c = Integer.parseInt(s3); //런타임 오류 --> ,가있으므로 숫자로 못 바꿈
		//System.out.println(s3);
		
		//s3 = "00.7";
		//c = Integer.parseInt(s3); //런타임 오류
		
		//s3 = "A100";
		//c = Integer.parseInt(s3); //런타임 오류
	}
}
