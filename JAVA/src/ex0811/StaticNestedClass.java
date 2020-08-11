package ex0811;

public class StaticNestedClass {
	public static void main(String[] args) {
	
		//Test5 obj = new Test5(); // 컴파일 오류 -> Test5는 단독클래스가 아니기 떄문
		
		
		//static class는 외부에서 단독 객체 생성 가능
		User5.Test5 obj = new User5.Test5(); 
		obj.write();
		
	}
}


class User5{ //User5의 객체를 생성하지 않아도 Test5의 객체생성
	static int a = 10;
	int b = 20;
	
	//static 중첩 클래스. 중첩 클래스에서만 static class가 가능 ==> 보안에 더 유리
	//외부 클래스의 객체 생성과 상관없이 외부에서 객체를 생성할 수 있음
	//컴파일하면  USer5$Test5.class 이름으로 컴파일됨
	public static class Test5{
		int c = 30;
		
		public void write() {
			//System.out.println(b);//컴오류 -> User5의 메모리 할당에 상관없는 클래스이기 때문에 접근 불가
			System.out.println(a+":"+c);
		}
	}
	
	public void print() {
		Test5 obj = new Test5();
		obj.write();
	}
}