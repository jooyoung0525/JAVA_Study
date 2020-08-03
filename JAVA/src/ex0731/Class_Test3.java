package ex0731;

public class Class_Test3 {
	public static void main(String[] args) {

		//객체선언과 메모리할당
		User3 u1;
		// u1.a=100; //컴파일 오류 -> 메모리 할당을 하지 않았기 떄문.
		
		//클래스 변수는 클래스명으로 접근.
		System.out.println(User3.c); //->기울기 있는거는 클래스변수나 클래스메소드
		//클래스 메소드는 클래스명으로 접근
		User3.sub2();
		
		
		u1= new User3();
		User3 u2 = new User3();
		
		// 레퍼런스변수를 선언 하면 heap영역에 할당받고, heap의 주소를 해당 변수에 넣어줌.
		System.out.println(u1); // ex0731.User3@15db9742 : 클래스명@해쉬코드 --> 해시코드 객체를 빠르게 보여주기 위해 사용.
		System.out.println(u2); // ex0731.User3@6d06d69c
		
		
		u1.a = 100; // 인스턴스 변수, 인스턴스 메소드는 객체로 접근
		u1.sub1();  //100:10:300
		
		u2.sub1();  //0:10:300
		
		
		// 클래스 변수나 클래스 메소드는 객체로 접근가능하지만
		// 객체생성과 상관 없으므로 클래스명으로 접근한다.
		//System.out.println(u1.c);
	}
}



class User3{ 
	
	int a; // 인스턴스 변수. 객체가 생성되면서 0으로 초기화
	       // 인스턴스 변수 : 객체가 생성되어야 사용할 수 있다.
	       // 인스턴스변수는 객체를 통해서 접근할 수 있다.
	
	int b = 10; // 인스턴스 변수. 객체가 생성되면서 10으로 초기화
	
	static int c = 300; // 클래스 변수
	      // 객체 생성과 상관없이 클래스가 로딩되면 바로 사용가능
	      // 클래스명을 이용하여 접근.
	
	
	// 인스턴스 메소드
	// 객체를 생성해야 호출할 수 있는 메소드
	public void sub1() {
		int n = 10; // 메소드 안에 선언된 변수
		            // 초기화( 값이 존재 )해야 사용가능 
		System.out.println("지역변수 : "+n);
		// 인스턴스 메소드는 인스턴스변수, 클래스변수 접근
		System.out.println(a+":"+b+":"+c ); //c -> 클래스 변수이기 때문에 sub1 호출하면 a:b:c출력 가능
	}
	
	
	
	// 클래스 메소드
	// 객체생성과 상관 없이 언제나 호출가능
	public static void sub2() {
		
		//System.out.println(a+":"+b); //a,b는 객체를 생성해야 호출가능하기 때문에 클래스 메소드에서 부를 수 없음.
		                               //컴파일 오류.
		
		System.out.println(c);
	}
}