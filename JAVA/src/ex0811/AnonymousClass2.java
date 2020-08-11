package ex0811;

public class AnonymousClass2 {
	public static void main(String[] args) {
		Object ob1 = new Object();
		System.out.println(ob1); //java.lang.Object@해시코드
		
		User8 ob2 = new User8();
		System.out.println(ob2); //Hi
		
		
		//방법2) 익명의 클래스를 생성
		Object ob3 = new Object() {
			@Override
			public String toString() {	
				return "Hi";
			}
		};
		System.out.println(ob3); //Hi
		
		
		
		//익명클래스
		Test8 tt = new Test8() {
			
			@Override
			public void print(String title, int s) {
			System.out.println(title+s);
			}
		};
		tt.print("합:",55);
		
	}
}


//ob1프린트하면 Hi출력하고싶음
//방법1) 클래스를 생성해서 toString 재정의.
class User8{
	
	@Override
	public String toString() {
		return "Hi";
	}
}

interface Test8{
	public void print(String title, int s);
}