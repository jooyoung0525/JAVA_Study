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
		System.out.println(c+","+d); //2.0E9,2.0E9 -> ������ c!=d������, float���� c==d
		System.out.println(e+","+f); //2.0E9,2.0000000E9
		System.out.println();
		
		System.out.printf("int : %d, %d\n", a, b);    // int : 2000000000 , 2000000050
		System.out.printf("float : %f, %f\n", c, d);  // float : 2000000000.000000, 2000000000.000000 --> float�� ����, ���� �ʿ�
		System.out.printf("double : %f, %f\n", e, f); // double : 2000000000.000000, 2000000050.000000
		
		System.out.println(a==b); //false
		System.out.println(c==d); //true --> float�� ����� ���� ������ �߻��ص� ��� ���� �� ���
		System.out.println(e==f); //false
		
	}
}
