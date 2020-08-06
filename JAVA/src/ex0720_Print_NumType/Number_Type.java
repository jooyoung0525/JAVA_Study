package ex0720_Print_NumType;

public class Number_Type {
	public static void main(String[] args) {
		int a;
		
		a = 100;
		System.out.println(a);
		
		a = 0b100; // '0b'는 2진수를 뜻함. 결과는 4
		System.out.println(a);
		
		a = 0100;  // '0'은 8진수를 뜻함. 결과는 64
		System.out.println(a);
		
		a = 0x100; // '0x'는 16진수를 뜻함. 결과는 256
		System.out.println(a);
		
		//a = 0b123; //컴파일 오류. 2진수에는 123없음
		//a = 019;   //컴파일 오류. 8진수에는 19없음

		a = 0xaf; // (10*16 + f*15 = 160+15 = 175)
		System.out.println(a);
	}
}
