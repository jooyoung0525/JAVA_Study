package ex0720;

public class Print_Int {
	public static void main(String[] args) {
		int a = 10;
		int b = 5; 
		int c;
		
		//System.out.println(c);
		
		c = a+b;
		
		// 문자열+기타자료형 => 문자열 결합
		//System.out.print(): 값을 출력 후 라인을 넘기지 않는다.
		/*
		System.out.print(a+"+"); 
		System.out.print(b);
		System.out.print("="+c);
		*/
		
		/*
		System.out.println(a+"+"); 
		System.out.println(b);
		System.out.println("="+c);
		*/
		
		System.out.println(a+"+"+b+"="+c);
	}
}
