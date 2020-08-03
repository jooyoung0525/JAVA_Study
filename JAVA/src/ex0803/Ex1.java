package ex0803;

public class Ex1 {
	public static void main(String[] args) {

	}
}


class User1{ //class 시작 이름은 대문자
	
	public int sum(int n) {  //메소드 시작이름은 소문자 
	                         //n:매개변수(가인수 -> 받는 매개변수)
		
		int s=0; //지역변수. 메소드를 호출할 때 메모리 할당을 받고, 메소드를 빠져나갈때 사라짐.
		
		for(int i = 1; i<n; i++) {
			s+=i;
		}
		
		return s;
	}
}