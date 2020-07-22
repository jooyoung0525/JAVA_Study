package ex0721;

public class PrimeNumber1 {
	public static void main(String[] args) {
		int a = 2000000000;
		int b = 2000000050;
		
		float c = 2000000000;
		float d = 2000000050;
		
		double e = 2000000000;
		double f = 2000000050;
		
		System.out.println(a+","+b); //2000000000,2000000050
		System.out.println(c+","+d); //2.0E9,2.0E9 -> 원래는 c!=d이지만, float형은 c==d
		System.out.println(e+","+f); //2.0E9,2.0000000E9
		System.out.println();
		
		System.out.printf("int : %d, %d\n", a, b);    // int : 2000000000 , 2000000050
		System.out.printf("float : %f, %f\n", c, d);  // float : 2000000000.000000, 2000000000.000000 --> float형 사용시, 주의 필요
		System.out.printf("double : %f, %f\n", e, f); // double : 2000000000.000000, 2000000050.000000
		
		System.out.println(a==b); //false
		System.out.println(c==d); //true --> float형 사용은 조금 오차가 발생해도 상관 없을 때 사용
		System.out.println(e==f); //false
		
	}
}
