package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.math.BigDecimal;


public class BigDecimal_Ex1 {
	public static void main(String[] args) {

		BigDecimal a = new BigDecimal("123456789.123456789");
		BigDecimal b = new BigDecimal("123456.789123456789");
		BigDecimal c;
		
		c = a.movePointLeft(3);
		System.out.println(c); //123456.789123456789
		
		c = a.divide(b);
		System.out.println(c); //1E+3
		
		//반올림 안함
		c = a.divide(b,BigDecimal.ROUND_DOWN);
		System.out.println(c); //1000.000000000
		
		//유효자리 5자리
		c=a.divide(b,5,BigDecimal.ROUND_DOWN);
		System.out.println(c);
	}
}
