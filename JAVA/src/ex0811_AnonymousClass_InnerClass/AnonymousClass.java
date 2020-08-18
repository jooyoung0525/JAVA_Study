package ex0811_AnonymousClass_InnerClass;

public class AnonymousClass {
	public static void main(String[] args) {
		//Test3 ob = new Test3();// 컴파일 오류 => 인터페이스는 객체 구현이안됨
		
		
		//익명의 클래스 ==> 이름 없는 클래스
		//컴파일하면 Ex3$1 이름으로 컴파일됨
		Test3 ob = new Test3() {

			@Override
			public int max(int a, int b) { //인터페이스에서 선언한 추상 메소드 구현 (메소드가 두개이상이면 불편)
				return a>b?a:b;
			}	
		};
		int n = ob.max(10, 5);
		System.out.println(n);
	}
}

interface Test3{
	public int max(int a,int b);
}