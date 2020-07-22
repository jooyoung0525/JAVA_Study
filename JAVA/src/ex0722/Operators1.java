package ex0722;

public class Operators1 {
	public static void main(String[] args) {
		int a = 10;
		boolean b;
		
		//Equality operators
		System.out.println(a == 10); //true
		System.out.println(a == 20); //false
		
		System.out.println(a != 10); //false
		System.out.println(a != 20); //true
		
		//relational operators
		b = a > 10;
		System.out.println(b); //false
		
		b = a >= 10;
		System.out.println(b); //true
		
		b = a < 10;
		System.out.println(b); //false
		
		b = a <= 10;
		System.out.println(b); //true
	}
}
