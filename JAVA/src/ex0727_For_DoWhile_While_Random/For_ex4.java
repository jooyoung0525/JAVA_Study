package ex0727_For_DoWhile_While_Random;

public class For_ex4 {
	public static void main(String[] args) {
		
		/*
		for(int n = 1; n<=10; n++)
			System.out.println(n); // 1 2 3 4 5 6 7 8 9 10
			*/
		
		for(int n = 1; n<=10; n++)
		{
			System.out.println(n);
			n+=2;
		}
		// System.out.println(n); --> 컴파일 오류! n:지역변수
	}
}
