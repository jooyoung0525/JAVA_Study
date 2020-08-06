package ex0804_Constructor_Recursion;

public class Overloading {
	public static void main(String[] args) {

		User3 ob = new User3();
		
		short a = 10;
		int b = 20;
		long c = 30;
		Short d = 40;
		
		// 기본자료형은 먼저 기본자료형에서 처리
		// 1순위 :동일한 자료형 , 2순위 :가장가까운 큰 자료형 (short:2byte<int:4byte), 3순위 :wrapper class
		ob.print();   // void  //인자없는 메소드...
		ob.print(a);  // int   //int:10
		ob.print(b);  // int   //int:20
		ob.print(c);  // Long  //Long:30  //long:8byte --> 1순위, 2순위 안됨 --> 3순위
		ob.print(d);  // Short //Short:40
	}
}



// overloading : 중복 정의
// 동일한 클래스에서 메소드의 이름은 동일하지만 
//    매개변수의 개수가 다르거나 매개변수의 타입이 다른경우
class User3{
	
	public void print() {
		System.out.println("인자없는 메소드...");
	}
	
	/*
	 * 컴파일 오류 :  매개변수가 같으면 (타입과 개수) 중복정의가 아니다.
        public int print() {
    	return 1;
        }
    */	
	
	 // Short : 기본자료형인 short를 클래스로 만들어 놓은 Wrapper 클래스
	 public void print(Short a) {
		 System.out.println("Short:"+a);
	 }
	 
	 public void print(int a) {
		 System.out.println("int:"+a);
	 }
	 
	 // Long : 기본자료형인 long을 클래스로 만들어 놓은 Wrapper 클래스
	 public void print(Long a) {
		 System.out.println("Long:"+a);
	 }
	 
}