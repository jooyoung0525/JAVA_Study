package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Date;

import util_DateClass.DateUtil;


public class Util_Test {
	public static void main(String[] args) {
		
		DateUtil util = new DateUtil(); // 내가 만든거 -> 다른 패키지에 있기 때문에 import해야함
		String s;
		Date date;
		
		//<<util.toDate 테스트>>
		s ="2020-10-10";
		date = util.toDate(s);
		
		//<<util.toString 테스트>>
		System.out.println(date); // Sat Oct 10 00:00:00 KST 2020
		System.out.println(util.toString(date));
		
		
		
		
		
		//<<util.toDiffDays 테스트>>
		int n;
		
		date = new Date();
		s = util.toString(date);
		n = util.toDiffDays("1995-05-16", util.toString(new Date())); //new Date() => Date형의 오늘날짜
		System.out.println("나현이가 오늘까지 살아온 날짜 : "+n);
		n = util.toDiffDays("1996-02-15", util.toString(new Date()));
		System.out.println("혜미가 오늘까지 살아온 날짜 : "+n);
		n = util.toDiffDays("1995-05-25", util.toString(new Date()));
		System.out.println("주영이가 오늘까지 살아온 날짜 : "+n);
		
	
	}
}
