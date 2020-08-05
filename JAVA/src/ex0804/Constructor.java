package ex0804;

public class Constructor {
	public static void main(String[] args) {

		Demo1 ob = new Demo1();
		System.out.println(ob.a); // 생성자...
		                          // 10
		
	}
}


class Demo1{
	int a;
	int b;
	
	/*
	 -- 생성자
	    - 클래스와 동일한 이름을 갖는다.
	    - 하나의 클래스에는 하나 이상의 생성자를 갖는다.
	    - 생성자는 리턴 타입이 존재하지 않는다.
	    - 생성자는 일반 메소드처럼 호출 할 수 없으며
	          객체를 생성할 때 new 다음에 기술한다.
	    - new 생성자(); 처럼 생성자를 호출하면
		   객체의 메모리가 할당되고
	          생성자의 몸체가 실행되어 초기화를 담당한다.
	    - 생성자는 중복 정의가 가능하다.
	    - 생성자를 만들지 않으면 컴파일러는 
	          아무런 코드도 없는 디폴트 생성자를 만든다.
	      public 클래스명() {} 
	 */
	public Demo1() {
		System.out.println("생성자...");
		a = 10;
		b = 20;
	}
	
	public void write() {
		System.out.println(a+":"+b);
	} 
}