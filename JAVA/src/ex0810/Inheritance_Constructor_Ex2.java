package ex0810;

public class Inheritance_Constructor_Ex2 {
	public static void main(String[] args) {
		
	}
}


class Test2{
	int a;
	int b;
	
	public Test2(int a, int b) { //인자 2개짜리 생성자
		this.a = a;
		this.b = b;
		System.out.println("super 생성자...");
	}
	
	public void write() {
		System.out.println(a+" : "+b);
	}
}


//super 클래스에 인자가 있는 생성자만 존재하면
//  sub 클래스는 반드시 생성자를 만들고 생성자 가장 앞에서
//  명시적 super(값)으로 상위 생성자를 호출해야함.
class User2 extends Test2{

	
	
	/*
	public User2() {
		super(); //오류! 상위클래스는 인자가 2개이므로 생성되지 않음 
		
	}*/
	
	
	public User2() {
		//this는 자기 클래스의 생성자 부름
		this(10,5); //this 가 아래의 User2(a,b)호출 -> super(a,b)호출 
	}
	public User2(int a, int b) {
		super(a,b);
		
	}
}