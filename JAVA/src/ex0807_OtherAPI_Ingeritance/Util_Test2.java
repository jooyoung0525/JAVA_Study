package ex0807_OtherAPI_Ingeritance;

import util_DateClass.DateUtil;

public class Util_Test2 {
	public static void main(String[] args) {
		DateUtil ob = new DateUtil();
		
		String s = "2020-08-07";
		//System.out.println(ob.toDaysLater(s, 100));
		//System.out.println(ob.afterDays(s));
		//System.out.println(ob.beforeDays(s));
	
		s = "600101-1000001";
		System.out.println(ob.isRrnCheck(s));
		System.out.println(ob.isDateCheck("2011-06-33"));
	}
}
