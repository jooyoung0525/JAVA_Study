package ex0812_Exception_Generic;

public class Exception_Ex1 {
	public static void main(String[] args) {
		int a = 2; int b = 0;
		int c;
		/*
		 * c=a/b; System.out.println(c);
		 * java.lang.ArithmeticException
		 */
		
		//����ó���� ���� ���� ���
		if(b!=0) {
			c=a/b;
			System.out.println(c);
		}else {
			System.out.println("0���� ���������ϴ�.");
		}
	}
}
