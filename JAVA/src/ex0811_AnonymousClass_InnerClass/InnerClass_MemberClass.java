package ex0811_AnonymousClass_InnerClass;

public class InnerClass_MemberClass {
	public static void main(String[] args) {
		
		//컴파일 오류. 먼저 외부객체를 생성해야함
		//User6.Test6 obj = new User6.Test6();
		
		User6 uu = new User6(); //1.외부클래스 객체 생성후
		User6.Test6 obj = uu.new Test6(); //2.내부의 클래스에 접근
		obj.write(); //가능은 하지만 이렇게 사용할 목적으로 만들지 않는다 ! 
		             //외부클래스 안에서 내부클래스 사용하기 위해 사용.
		
	}
}


class User6{ 
	static int a = 10;
	int b = 20;
	
	//내부 클래스(member class)
	//다른 클래스에서 객체를 생성할 때 외부 클래스의 객체를 생성하지 않고는
	//객체생성이 불가능한 클래스 
	//중첩과 차이점 static없음!
	public class Test6{
		int c=30;
		public void write() {
			System.out.println(a+":"+b+":"+c);
		}
	}
	
	public void sub() {
		Test6 obj = new Test6();
		obj.write();
	}
}