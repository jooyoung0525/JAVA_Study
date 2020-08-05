package ex0804;

public class Static_Init_Block {
	public static void main(String[] args) {

		Demo9 ob; //참조변수를 선언만 한 상태는 아직 클래스가 로딩되기 전
		
		// 클래스 변수를 사용하므로 클래스가 로딩됨
		//     아래 1)~4)번까지는 단 한번만 실행
		// 1) static 변수가 메모리 할당을 함.
		// 2) static 변수의 초기화 작업
		//    c <- 0 , d <- 20
		// 3) static 초기화 블럭이 실행
		//    c <- 5
		System.out.println(Demo9.c); //static 초기화 블럭
		                               //5
		
		
		
		
		ob = new Demo9(); //객체만 생성
	 // 1) 클래스가 로딩이 일어나므로 먼저 아래 작업을 한번만 실행
	 //	   static변수 메모리 할당, static 초기화,
     //    static 블록 실행		 
  	 // 2) 객체가 생성 될때 마다
	 //    인스턴스변수 메모리 할당,
	 //    초기화, 초기화 블럭 실행, 생성자 몸체 실행
		
	  ob.write();
	}
}


class Demo9 {
	
	int a; 
	int b = 10;
	static int c;
	static int d = 20;
	
	{ 
		c= 20;
		System.out.println("인스턴스 초기화 블럭...");
	}
	
	static { 
		//static 초기화 블럭
		c=5;
		System.out.println("static 초기화 블럭");
		
	}
	
	public Demo9() {
		System.out.println("생성자...");
	}
	
	public void write() {
		System.out.println(a+":"+b+":"+c+":"+d);
	}
}