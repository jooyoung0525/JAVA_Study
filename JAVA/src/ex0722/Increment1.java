package ex0722;

public class Increment1 {
	public static void main(String[] agrs) {
		
		int a,b;
		
		a = 10;
		a++; // a = a+1과 동일한 결과
		System.out.println(a);
		
		a = 10;
		++a; // a = a+1과 동일한 결과
		System.out.println(a);
		  
		
		a = 10;
		b = ++a; // a = a + 1; b = a; 와 동일한 결과
		System.out.println(a+","+b); //11,11
		
		a = 10;
		b = a++; // b = a; a = a + 1;
		System.out.println(a+","+b); //11,10
		
		
		a = 10;
		b = --a; // a = a - 1; b = a; 와 동일한 결과
		System.out.println(a+","+b); //9,9
		
		a = 10;
		b = a--; // b = a; a = a - 1;
		System.out.println(a+","+b); //9,10
	}
}
