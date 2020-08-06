package ex0804_Constructor_Recursion;

public class Constructor_this2 {
	public static void main(String[] args) {

		
	}
}


class Demo6{
	int a;
	static int b;
	
	public void set(int a) {
		this.a = a;
	}
	
	public static void method(int b) { //인스턴스 메소드가 아니기 때문에 컴파일오류
		//this.b = b; 컴파일 오류.
		//this는 static메소드에서 사용 불가

		Demo6.b = b;
	}
	
	
	public void write() {
		System.out.println(a+":"+b);
	} 
}