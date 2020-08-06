package ex0804_Constructor_Recursion;

public class Constructor_instance_class {
	public static void main(String[] args) {
		Demo5 ob = new Demo5();
		ob.sub1(); 
		ob.write(); //0:0
		
		ob.sub2(); 
		ob.write(); //1:10
	}
}


class Demo5{
	
	int a; //인스턴스 변수 
	static int b; //클래스 변수
	
	
	
	public void sub1() {
		int a;
		int b;
		
		a = 10;
		b = 20;
		System.out.println("sub1: "+ a+","+b); //sub1: 10,20
	}
	
	
	
	
	public void sub2() {
		int a;
		int b;
		
		a = 1;
		b = 2;
		System.out.println("sub2: "+a+","+b);
		
		
		
		this.a = 1; //인스턴스 변수
		
		//this.b = 10; //경고 :b는 클래스 변수이기 때문에 this를 쓸 수 없음
		               // 일반적으로 클래스 변수는 this대신 클래스명으로 접근
		
		Demo5.b = 10; //클래스 변수
	}
	
	
	
	public void write() {
		System.out.println(a+":"+b); //여기서는 this.a, Demo5.b 생략 가능해서 생략해 줌
	}
}