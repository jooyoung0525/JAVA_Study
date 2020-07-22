package ex0720;

public class Type_System {
	public static void main(String[] args) {	
		//byte < short < int < long (정수형 자료형 크기)
		
		//하나의 변수 선언
		byte a;
		//여러개의 변수선언
		short b, c;
		//변수 선언과 동시에 초기화
		int d = 10;
		long e = 10, f; //변수형 선언하고 사용안하면 !로 왼쪽에 오류표시 (버그가 날 수 있음을 알려줌)
		
		// System.out.println(a); -> 컴파일 오류 (문법이 틀릴때 발생) //a초기화 되지 않은 a는 출력 불가
		
		a=10;
		System.out.println(a);
		
		a=20; //변수는 실행중 다른 값을 가질수 있다.
		System.out.println(a);
		
		//a=200; -> 컴파일 오류. byte형 범위: -128~127
		
		b = 10;
		c = 20;
		System.out.println(b+c);
		
		// n=b+c; short는 연산불가  --> short + short = (무조건)int형
			      // 큰 자료형의 결과는 적은 자료형에 대입 불가
				  // 컴파일 오류
		
		d = b+c;
		System.out.println(d);
		
		System.out.println(e);
		
		//f=2200000000; //22억이 int범위를 벗어나기 때문에 오류 발생 -> 컴파일오류
		f = 2200000000L; //long형 리터럴 -> 숫자 뒤에 L을 붙여줌
		System.out.println(f);
	}
}
