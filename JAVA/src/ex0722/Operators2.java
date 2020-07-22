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
		 * false &&  anything  => false로 단축연산 ==> 앞 부분이 false면 뒷 부분 연산 안함!!
		 * true || anything => true로 단축연산 ==> 앞 부분이 true면 뒷 부분 연산 안함!!	 
		 * 관계연산자가 증감연산자(--.++)보다 먼저 연산함!
		 * 
		 * Ex1)
		 * a = 20; b = 20;
		 * c  = a++ > 20 && ++b > 20 --> 20>20 =false --> 뒤에연산안함 --> a++ --> 21,20,false
		 * 
		 * Ex2) 
		 * a = 20; b = 20;
		 * c = a++ > 20 || ++b > 20 --> 
		 * */
	}
}
