package ex0722;

public class Assignment_Operator {
	public static void main(String[] args) {
		
		int a = 10;
		a += 5; // a=a+5; 같은 결과
		        // a++; a+=1;
		System.out.println(a);
		
		short b = 10;
		//b = b + 5; //컴파일 오류 (자료형) --> 내부적으로 캐스팅 해야하기 때분에 배정 연산자(캐스팅 안함)가 더 빠름!
		b += 5; //배정 연산자는 
		        //byte, short, char에서 int형으로 형 변환이 일어나지 않음!
		System.out.println(b);
		
		float c = 4.5f;
		char d = 'A';
		d += c;
		System.out.println(d); // E --> 65 + 4.5 = 70.5 ==> 70 ==> 'E'
		
		
		/*
		 * <형 변환 일어나지 않는 연산자> --> 일반적인 연산보다 속도가 빠름! 하지만 같은 결과를 가짐 (일반적인 연산자 -> int로 형변환)
		 * ++ , --
		 * 배정연산자
		 * 
		 * */
	}
}
