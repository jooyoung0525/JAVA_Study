package ex0804_Constructor_Recursion;

public class Class_Object {
	public static void main(String[] args) {
		
		//User1 ob;
		//ob.a = 10; ob가 초기화되지 않음. 컴파일 오류
		
		//ob = null; // 초기화는 되었지만 메모리할당이 안됨. 런타임오류
		
		
		User1 ob1 = new User1(); //객체 생성
		System.out.println(ob1); //패키지명.클래스명@해시코드 --> ex0804.User1@15db9742 
		                         //--> 생성된 객체가 어디있는지 가지고있음
		                     
		ob1.a = 10;
		System.out.println(ob1.a);//10
		
		ob1 = new User1();// 새로운 객체 생성 
		                  //이전 ob1이 가르키고 있던 참조영역은 메모리를 회수
		System.out.println(ob1.a); //0
		System.out.println(ob1);   //위에와는 다른 코드! -> 새로운 주소값이 저장됨.
	}
}



class User1{
	int a;
	int b;
	String c; //첫글자가 대문자면 클래스 아니면인터페이스
}