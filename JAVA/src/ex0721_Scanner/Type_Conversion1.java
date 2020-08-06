package ex0721_Scanner;

public class Type_Conversion1 {
	public static void main(String[] args) {
		byte a, b=10;
		a ='A'; // 문자A = 65이기 때문에 오류가 발생하지 않음.
		// a = 200; 컴파일 오류
		System.out.println(a+","+b);
		
		a=(byte)400; //강제형변환 때문에 잘림현상 발생
		System.out.println(a); //-112

		a=(byte)40000; //오버플로우가 발생한다고 모두 음수가 되는건 아님 -> 맨앞자리가 0이기 때문에 양수
		System.out.println(a); //64
		
		int c =65,d;
		d = 1_0_1; //_ --> JDK7부터 사용가능. '_'를 통해 각각의 자리값을 구분가능.
		System.out.println(d); //101
		
		
		char e;
		//e = c; //컴파일 오류. 작은 자료형(char)에 큰 자료형(int)을 대입하였기 때문.
		e = (char)c; // int -> char 강제형변환
		System.out.println(c+","+e); //c = 65 , e = A	
	}
}