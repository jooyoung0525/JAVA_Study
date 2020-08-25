package ex0825;

public class Lambda2 {
	public static void main(String[] args) {
		
		//매개변수 1개, 리턴타입 void 람다식 ==> 1) , 2), 3) 모두 같은 결과.
		// 1) User3 obj = (int a) -> {int n = a+10; System.out.println(n);};
		// 2) User3 obj = (a) -> {int n = a+10; System.out.println(n);};   ==> 괄호안에 타입안써주면 알아서 인식해줌
		 User3 obj = a -> {int n = a+10; System.out.println(n);};   //==> 매개변수 하나이면 괄호생략가능
		
		obj.sub(5);
	}
}

@FunctionalInterface //람다가 가능하지 않는 경우 오류
interface User3{
	public void sub(int a);
}