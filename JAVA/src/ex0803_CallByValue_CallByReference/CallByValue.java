package ex0803_CallByValue_CallByReference;

public class CallByValue {
	public static void main(String[] args) {
		User4 u = new User4();
		int x = 5;
		// 매개변수 전달 기본자료형 : call by value
		// 실매개변수와 형식 매개변수가 기억공간 따로 확보
		u.sub(x); //x:실매개변수
		System.out.println(x); //5
	}
}


class User4{
	public void sub(int a) { //a: 형식 매개변수
		a+=10;
		System.out.println("sub:"+a); //15
	}
}