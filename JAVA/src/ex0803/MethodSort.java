package ex0803;

public class MethodSort {
	
	//인스턴스변수는 객체를 생성해야 사용
	int a = 10, b = 20; //필드. 인스턴스 변수
	//클래스변수는 객체를 생성과 상관없이 사용
	static int x = 100; //필드. 클래스 변수
	
	public void sub1() { //인스턴스메소드
		sub2(); //sub1도 인스턴스이기 때문에 sub2를 그냥 부를 수 있음
		System.out.println(a+":"+b);
		System.out.println(x); //객체를 생성하던 생성하지 않던 상관 없는 클래스 멤버이기 때문에 
	}
	
	//인스턴스메소드는 객체를 생성해야 호출 할수 있는 메소드
	public void sub2() { //인스턴스메소드
		System.out.println("sub2...");
		
	}
	
	//클래스메소드는 객체 생성과 상관 없이 호출
	public static void sub3() { //클래스메소드
		
		//System.out.println(a); //컴파일오류
		//sub1(); //컴파일오류 
		System.out.println(x);
		
		MethodSort ob = new MethodSort();
		ob.sub1(); //인스턴스 메소드이기 때문에 객체생성해야함
	}
	
	public static void main(String[] args) { //클래스메소드
	
		// sub1(); //컴파일 오류 -> main은 클래스 메소드이기 때문에 객체 생성해줘야함
		//System.out.println(a); //컴파일오류
		
		System.out.println(x);
		
		sub3();
	}
}

class User3 {
	public void method1() {
		
		//System.out.println(x); //오류 다른 클래스에서 부르기 때문에 Ex3.x로 써야함
		System.out.println(MethodSort.x);
		
		
		//System.out.println(MethodSort.a); //오류 다른 클래스에서 부르기 때문에 Ex3.x로 써야함
		//System.out.println(MethodSort.a); //컴파일오류 -> 객체생성해야함
		
		MethodSort e = new MethodSort();
		System.out.println(e.a);
	}
	
	
	public static void method2() {
		
		MethodSort.sub3(); //클래스 메소드 --> 같은 클래스 안에서는 그냥 sub3()으로만 호출 가능 
		                   //              다른 클래스에서 클래스메소드 호출하고 싶을 때, 클래스이름.sub3()으로 호출
		
	}
}

