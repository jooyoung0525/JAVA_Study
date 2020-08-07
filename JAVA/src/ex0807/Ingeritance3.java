package ex0807;

public class Ingeritance3 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		User3 u = new User3();
		
		t.write(); //super write...
		u.write(); //sub write...
		
		//t.sub(); 
		            /* 컴파일 오류. 상위클래스는 하위클래스의 메소드에 접근 불가.
		            * 아버지가 태어나면 자식은 무조건 태어나지만, 자식이 먼저 태어나는 경우가 없음
		            * 태어나는거 = 메모리할당.
		            */
		
		//Object ob = u; //up casting. 언제나 가능
		Test3 tu = u; // up casting .언제나 가능
		              // Test3 tu =>원래는 User3 객체 => u값(참조변수)을 넣어줌
		System.out.println(t); //ex0807.Test3@
		System.out.println(tu); //ex0807.User3@
		
		tu.write(); //sub write...
		
		//객체가 업캐스팅된경우 상위메소드가 하위에서 재정의된 경우
		// 하위에서 재정의된 경우 메소드를 호출하면 재정의된 메소드 호출
		
		System.out.println(tu.c);//30 --> 필드는 무조건 자기클래스 우선!
		// 객체가 업캐스팅된 경우에도 필드는 무조건 자기것이 우선순위가 높다.

		//tu.sub(); 컴파일 오류.
		//System.out.println(tu.d);//컴파일 오류
		 
		//User3 ut = tu; //컴파일 오류 -> 상위객체는 하위에 넣을 수 없음
		
		User3 ut = (User3)tu; //down casting
		  // down casting은 반드시 casting해야함
		  // down casting은 up casting 한것만 가능
		System.out.println(ut);//ex0807.User3@
		System.out.println(ut.c); //100
		
		//User3 ut2 = (User3)t; // 런타임 오류. down casting은 up casting한 경우에만 할 수 있음
		
		if(tu instanceof User3) {
			//true인 경우에만 down casting가능
			System.out.println("User3 객체");
		}
		
		if(t instanceof User3) { //false
			User3 ut3 =(User3)t;
		}else {
			System.out.println("tt는 User3객체가 아님");
		}
		
		int a = tu.c;
		System.out.println(a); //30
		
		//a = (User3)tu.c; //런타임 오류 
		 a=((User3)tu).c; //.이 ()보다 연산속도가 빠르기 때문에 다운캐스팅을 먼저하고 c를 가르켜줘야함 
		System.out.println(a); //100
			
	}
}


class Test3{
	private int a = 10;
	int b = 20;
	int c = 30;
	
	
	public void print() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public void write() {
		System.out.println("super write...");
	}
}


class User3 extends Test3{
	int c = 100;
	int d = 200;
	
	public void sub() {
		System.out.println(b+":"+c+"d");
	}
	
	//Override. 재정의
	public void write() {
		System.out.println("sub write...");
	}
	
	
	public void method() {
		System.out.println(c);//100
		System.out.println(this.c); //100 -> 클래스 내부에서만 가능
		System.out.println(super.c); //30  -> 클래스 내부에서만 가능
		
		write(); //sub write
		super.write(); //super write
	}
}