package ex0812_Exception_Generic;

public class Ex13 {
	public static void main(String[] args) {
		
	}
}
//사용자 정의 예외 클래스 만들기(checked exception)
class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 네트워크 전송시 객체를 구분하기 위한 상수값
	
	public MyException(String message) {
		super(message);
	}
}

class User18{
	public int sum(int n) throws MyException {
		int s = 0;
		
		if(n<0) {
			throw new MyException("0이상이만 가능");
		}
		for(int i =1;i<=s;i++) {
			s+=i;
		}
		return s;
	}
}