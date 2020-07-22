package ex0722;

public class Increment2 {
	public static void main(String[] args) {
		
		char a;
		
		a='A';
		//a=a+1; -> 컴파일 오류  // 문자 + 정수 = 정수, a는 문자형이라 int를 a에 넣을 수 없음
		//a=(char)(a+1);
		a++; //형변환이 일어나지 않는다. -> 1만 증가하는거면 형변환을 해서 a+1을 사용하는거보다 편리.
		System.out.println(a); //B
		
		int b,c;
		b = 0;
		c = b---b; //-> b - (--b) => 0 - (-1) => 1
		System.out.println(c); //1 
		
		System.out.println(3 / 0.0); //Infinity
		System.out.println(3 % 0.0); //NaN -> 숫자가 아니라는 뜻
	}
}
