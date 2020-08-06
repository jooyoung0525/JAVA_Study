package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.math.BigInteger;

public class BigInteger_Ex1 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("987654321");
		BigInteger b = new BigInteger("123456789");
		BigInteger c;
		
		c = a.add(b);
		System.out.println(c);
		
		
		c = a.subtract(b);
		System.out.println(c);
		
		c = a.multiply(b);
		System.out.println(c);
		
		c = a.divide(b);
		System.out.println(c);
		
	}
}
