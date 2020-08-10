package ex0807_OtherAPI_Ingeritance;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatClass1 {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		String a;
		
		a = nf.format(3.141592);
		System.out.println(a);// 3.142 //�Ҽ��� 3�ڸ����� �ݿø�
		
		nf.setMaximumFractionDigits(4); //�Ҽ��� �ִ� �ڸ��� ����
		nf.setMinimumFractionDigits(2); //�Ҽ��� �ִ� �ڸ��� ����
		
		a = nf.format(12345.1438475);
		System.out.println(a); //12,345.1438 
		
		a= nf.format(123);
		System.out.println(a); //123.00
		
		//�ý����� Local�� ����
		NumberFormat nf3 = NumberFormat.getCurrencyInstance();
		long n = 123456;
		a = nf3.format(n);
		System.out.println(a); //��123,456
		
		//������ ���� : �̱�
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.US);
		a = nf4.format(n);
		System.out.println(a); //$123,456.00
		
		
	}
}
