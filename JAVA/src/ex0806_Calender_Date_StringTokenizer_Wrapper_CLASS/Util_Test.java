package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Date;

import util_DateClass.DateUtil;


public class Util_Test {
	public static void main(String[] args) {
		
		DateUtil util = new DateUtil(); // ���� ����� -> �ٸ� ��Ű���� �ֱ� ������ import�ؾ���
		String s;
		Date date;
		
		//<<util.toDate �׽�Ʈ>>
		s ="2020-10-10";
		date = util.toDate(s);
		
		//<<util.toString �׽�Ʈ>>
		System.out.println(date); // Sat Oct 10 00:00:00 KST 2020
		System.out.println(util.toString(date));
		
		
		
		
		
		//<<util.toDiffDays �׽�Ʈ>>
		int n;
		
		date = new Date();
		s = util.toString(date);
		n = util.toDiffDays("1995-05-16", util.toString(new Date())); //new Date() => Date���� ���ó�¥
		System.out.println("�����̰� ���ñ��� ��ƿ� ��¥ : "+n);
		n = util.toDiffDays("1996-02-15", util.toString(new Date()));
		System.out.println("���̰� ���ñ��� ��ƿ� ��¥ : "+n);
		n = util.toDiffDays("1995-05-25", util.toString(new Date()));
		System.out.println("�ֿ��̰� ���ñ��� ��ƿ� ��¥ : "+n);
		
	
	}
}
