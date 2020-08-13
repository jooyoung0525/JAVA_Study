package ex0812_Exception_Generic;

public class Exception_Ex2 {
	public static void main(String[] args) {
		int a= 20;
		int b=0;
		int c;
		
		try {
			//예외가 발생할 가능성이 있는 코드
			c=a/b;
			System.out.println("결과: "+c);
		} catch (ArithmeticException e) {
			//ArithmeticException : 연산이 불가능할때 발생 . 예를 들어 0으로 나눌때
			//런타임시 발생하는 unchecked exception이라고 함
			//예외가 발생할 때 실행할 코드
			System.out.println("수를 0으로 나눌수 없다.");
		}
		System.out.println("종료...");
	}
}
