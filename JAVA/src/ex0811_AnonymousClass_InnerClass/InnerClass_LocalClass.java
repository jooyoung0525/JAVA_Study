package ex0811_AnonymousClass_InnerClass;

public class InnerClass_LocalClass {
	public static void main(String[] args) {
	
	}
}

class User7{
	int a = 10;
	
	public void write() { //로컬 클래스
		                  //메소드 안에서 클래스 생성은 가능하지만
		                  // 이렇게 프로그램 짜면 안됨!!!!
		int b = 20;
		final int c = 30;
		
		class Test7{
			void print() {
				System.out.println(a+":"+c);
				System.out.println(b); //8.0부터 가능
			}
		}
		
		//b = 200; //내부 클래스에서 error.
		           // 내부 클래스에서 사용하면 final 성질을 가짐.
		 
		Test7 obj = new Test7();
		obj.print();
	}
}