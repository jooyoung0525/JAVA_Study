package ex0722;

public class Operators2 {
	public static void main(String[] args)
	{
		int a = 10, b = 5;
		boolean c = true, d;
		
		d = a>b && c; //true && true => true
		System.out.println(d);
		
		d = a > b || c; // true || true => true
		System.out.println(d);
		
		d = a < b && c; // false && true => false
		System.out.println(d);
		
		d = a < b || c; // false || true =>  false
		System.out.println(d);
		
		
		/*
		 * false &&  anything  => false�� ���࿬�� ==> �� �κ��� false�� �� �κ� ���� ����!!
		 * true || anything => true�� ���࿬�� ==> �� �κ��� true�� �� �κ� ���� ����!!	 
		 * ���迬���ڰ� ����������(--.++)���� ���� ������!
		 * 
		 * Ex1)
		 * a = 20; b = 20;
		 * c  = a++ > 20 && ++b > 20 --> 20>20 =false --> �ڿ�������� --> a++ --> 21,20,false
		 * 
		 * Ex2) 
		 * a = 20; b = 20;
		 * c = a++ > 20 || ++b > 20 --> 
		 * */
	}
}
