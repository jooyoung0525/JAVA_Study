package ex0804;

public class Class_ObjectArray {
	public static void main(String[] args) {
		User2 ob;
		
		//객체 배열
		User2 []list = new User2[3]; // 1. User2 객체 저장할 수 있는 공간만 3개 확보
		   //User2 u1,u2,u3; 과 유사
		
		//list[0].a= 10; 런타임오류. 객체생성이 되지 않아서
		

		// 방법 1
		ob = new User2(); // 객체 생성
		ob.a = 10;
		list[0]=ob; //ob: 주소, list : 주소
		
		ob = new User2(); // 객체 생성
		ob.a = 100;
		list[1]=ob;
		
		System.out.println(list[0].a); //10
		System.out.println(list[1].a); //100
		
		
		// 방법 2
		list[2]=new User2(); //위에와 같음. 바로 메모리할당
		list[2].a = 50;
		System.out.println(list[2].a); //50
	}
}



class User2{
	int a,b;
	String c;
}