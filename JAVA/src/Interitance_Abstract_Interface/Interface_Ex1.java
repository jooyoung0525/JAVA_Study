package Interitance_Abstract_Interface;

public class Interface_Ex1 {
	public static void main(String[] args) {
		Test11 tt = new User11();  //업캐스팅 -> 인터페이스가 아빠
		
		tt.disp();
		
		//tt.print()//오류
		((User11)tt).print(); //다운캐스팅해서 호출
		
		System.out.println(Test11.a);//바로 접근가능
	}
}


//인터페이스는 메소드의 선언만 존재
interface Test11{ //메소드 선언가능, 변수생성가능 
	
	//인터페이스는 public만 가능!
	//접근제어자 안붙이면 자동으로 public
	
	public int a = 10; // public static final int a = 10; 과 같음.
	
	public void fun(); //컴파일러가 public abstract void fun()으로 컴파일
	void disp(); // public abstract void disp(); -> 디폴트메솓
}

class User11 implements Test11 { //추상클래스는 추상메소드 가질 수 있음 ( = abstract class USer11 implements Test11 하면 오류안생김)

	@Override
	public void fun() {

		System.out.println("fun...");
	}

	@Override
	public void disp() { //재정의 할때는 접근제어자 낮출 수 없다. Test11엔 default 
		System.out.println("disp...");
		
	} 
	
	public void print() {
		System.out.println("print...");
	}
	
}