package ex0803_CallByValue_CallByReference;

public class Object_CallByReference {
	public static void main(String[] args) {

		User5 u = new User5(); //참조형변수 -> 주소만 저장!
		System.out.println(u.a); //10
			
		// call by reference : 참조변수를 매개변수로 전달
		// 실매개변수와 형식매개변수가 같은 기억공간을 참조
		
		
		u.sub(u); //객체를 매개변수로 전달 -> 주소값을 전달
		System.out.println(u.a); //60
	}
}


class User5{
	
	int a = 10; //필드 (지역변수아님)
	
	public void sub(User5 ob) {//이 줄을 메소드 시그니처라 함 //main에서 주소값을 전달받음
		ob.a +=50;
		System.out.println("sub ob.a: "+ ob.a);
	}
}