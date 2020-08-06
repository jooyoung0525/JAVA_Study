package ex0721_Scanner;

public class Print_NumberType {
	public static void main(String[] args) {
		int a,b;
		
		a=7;
		b='7'; //아스키코드 55
		System.out.println(a+","+b);
		
		
		char c;
		c='\u0041'; // 0041은 유니코드를 16진수로 표현 --> 1*1 + 16*4 = 65
		System.out.println(c); // A
		
		c ='\101'; // 101은 유니코드를 8진수로 표현 --> 1*1 + 8*8 = 65 
		System.out.println(c); // A
		
		c='\uFFFF'; // 65535를 16진수
		System.out.println(c); //이상한 문자 출력됨
		
		a = c; // int(4byte) <- char(2byte) 가능
		System.out.println(a); // 65535
		
		
	}
}
