package ex0722;

public class Divide {
	public static void main(String[] args) {
		int a;
		double b;
		
		a = 13 / 2;
		System.out.println(a); //6
		
		b = 13 / 2; // int / int = int ==> double�� ���� 
		System.out.println(b); //6.0
		
		b = 13.0 / 2; // double / int => double / double => double
		System.out.println(b); //6.5
		
		a = 13 % 2;
		System.out.println(a); //1
		
		b = 3.7 % 1.3; //�ڹٴ� �Ǽ��� %������ ����!! (C���� �ȵ�)
		System.out.println(b); //1.1
		
		b = 'A' / 10; 
		System.out.println(b); //6.0
	}
}
