package ex0721;

public class PrimeNumber2 {
	public static void main(String[] args) {
		float a,b;
		a = 30;
		b = 'A';
		System.out.println(a+","+b); // a = 30.0 , b = 65.0
		
		// a = 0.0; // 컴파일 오류 -> 0.0 : double 형 리터널(실수의 기본형은 double형)
		            //double형은 float에 대입 불가

		
		a = 13.123456789f; //단정도형 실수 -> 항상 뒤에 f붙음
		System.out.println(a); //13.123457 --> 소수 이하 6자리 출력, 소수 이하 6자리 이상은 자동 반올림
		
		a = 123456789.123456789f;
		System.out.println(a); //1.23456792E8 : 1.23456792 * 10^8 -->이상한 값 나옴. float는 조심해서 사용해야함.
		
		double c;
		c=123456789.123456789;
		System.out.println(c); //1.2345678912345679E8 --> float형 보다 정밀함
		
		c=3.14D;
		System.out.println(c); //3.14
		
		c = 1.2e-04; //1.2 * 10^-4
		System.out.println(c);
		
		a=(float)c; //double를  float로 형변환
		System.out.println(a);
		
	}
}