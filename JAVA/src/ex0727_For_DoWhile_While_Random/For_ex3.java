package ex0727_For_DoWhile_While_Random;

public class For_ex3 {
	public static void main(String[] args) {
	
	
		int s = 0;
		
		for(int n = 0; n<=10; n++) //n: 지역변수
			s+=n;
		
		//System.out.println(n); //컴파일 오류 : for문에서 선언된 변수는 for문 밖에서 사용불가
		System.out.println(s);
		
		//int s = 0; //컴파일 오류 -> main문 안에서 s를 선언했기 때문에 main문에서 다시 변수를 선언하면 오류가 남 
		//int n = 0; //가능 --> for문안에서 변수 선언했기 때문에 가능
		
	}
}
