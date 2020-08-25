package ex0825;

public class Lambda {
	public static void main(String[] args) {
		//리턴타입이 void이며 파라미터가 없는 람다식
		User2 obj = ()-> {System.out.println("안녕");}; 
		//User2 obj = ()-> System.out.println("안녕");  ==> 식이 한줄일 때,{}생략가능.
		obj.write();
	}
}

interface User2{
	public void write();
}