package ex0720;

public class Print_Int {
	public static void main(String[] args) {
		int a = 10;
		int b = 5; 
		int c;
		
		//System.out.println(c);
		
		c = a+b;
		
		// ���ڿ�+��Ÿ�ڷ��� => ���ڿ� ����
		//System.out.print(): ���� ��� �� ������ �ѱ��� �ʴ´�.
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
