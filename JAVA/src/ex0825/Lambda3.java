package ex0825;

public class Lambda3 {
	public static void main(String[] args) {
		
		//매개변수 2개, 리턴타입 int인 람다식 ==> 아래 모두 같은결과
		
		// 1) User4 u = (a,b) -> {int c = a+b; return c;};
		// 2) User4 u = (a,b) -> {return a+b;};
		User4 u = (a,b) -> a+b;
		
		System.out.println(u.add(10, 5));
	}
}

@FunctionalInterface //람다가 가능하지 않는 경우 오류
interface User4{
	public int add(int a, int b);
}