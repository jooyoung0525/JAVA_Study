package ex0722_Operator;

public class Type_Conversion2 {
	public static void main(String[] args) {
		byte a = 10, b = 5, c;
		int d;
		
		// c = a+b; //컴파일 오류 -> byte + byte = int + int => int --> int 형을 byte에 담을 수 없음
		c = (byte)(a+b); // (byte)a+b -> a만 byte로 바꿔줌
		d = a+b;
		System.out.println(d);
		
		
		// a = 200;  //컴파일 오류 -> overflow발생
		a=100;
		b=70;
		c=(byte)(a+b); //형변환 때문에 결과가 잘림 현상
		System.out.println(c); //-86
		
		
		char c1 = 'A', c2 = 'B', c3;
		//c3 = c1+c2; 컴파일 오류 -> char + char  => int + int => int
		d = c1+c2;
		System.out.println(d);

		c3 =(char) (c1 + 2); // A다음다음의 문자를 알고 싶을 때
		System.out.println(c3);		
	}
}
