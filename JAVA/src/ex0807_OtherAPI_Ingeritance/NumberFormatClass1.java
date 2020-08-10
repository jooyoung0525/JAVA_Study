package ex0807_OtherAPI_Ingeritance;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass1 {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		String a;
		
		a = nf.format(3.141592);
		System.out.println(a);// 3.142 //소수점 3자리까지 반올림
		
		nf.setMaximumFractionDigits(4); //소수점 최대 자리수 설정
		nf.setMinimumFractionDigits(2); //소수점 최대 자리수 설정
		
		a = nf.format(12345.1438475);
		System.out.println(a); //12,345.1438 
		
		a= nf.format(123);
		System.out.println(a); //123.00
		
		//시스템의 Local로 설정
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		long n = 123456;
		a = nf3.format(n);
		System.out.println(a); //￦123,456
		
		//국가별 설정 : 미국
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		a = nf4.format(n);
		System.out.println(a); //$123,456.00
		
		
	}
}
