package Interitance_Abstract_Interface;

public class Inheritance_Constructor_Ex1 {
	public static void main(String[] args) {
		User1 uu = new User1();
		uu.print();
	}
}



class Test1 { // default =>같은 패키지 안에서 접근가능 //Test1의 아버지는 Object
	private int a;
	int b;

	{
		System.out.println("super 초기화 블럭");
	}

	public Test1() {

		System.out.println("super 생성자...");
		a = 10;
		b = 20;
	}

	public void print() {
		System.out.println(a + ": " + b);
	}
}



class User1 extends Test1 { //상속받으면 아버지가 메모리할당 되지 않으면 자식은 절대 사용불가
	int b;
	int c;

	{
		System.out.println("sub 초기화 블럭");
	}

	public User1() {
		super(); //최상단에 단 한번만! 생략하면 컴파일러가 추가 ==> 아버지의 생성자를 부름
		         //this와 함께 사용불가 
		b = 100;
		c = 200;
		System.out.println("sub 생성자...");
	}

	public void write() {
		// System.out.println(a); //private 이므로 바로 접근 불가 -> 위에 print부르면됨
		System.out.println("sub : " + b + " : " + c);
	}
}