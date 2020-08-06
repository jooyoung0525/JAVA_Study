package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;

public class CalendarClass_Basic {
	public static void main(String[] args) {
		
		//Calendar는 추상 클래스로 직접 객체를 생성할 수 없음.
		
		//<<객체 생성 방법-1 :시스템의 날짜로 객체를 생성>>
		Calendar cal = Calendar.getInstance();
		
		String s = String.format("%tF %tA %tT",cal,cal,cal); //%tF : 년월일 , %tF : 요일 , %tT :시간
		System.out.println(s);
		
		
		//<<년도,월,일을 하나씩 분리>>
		int y = cal.get(Calendar.YEAR);  //년도
		//System.out.println(y);
		
		//월은 0~11로반환
		int m = cal.get(Calendar.MONTH)+1;  //월
		//System.out.println(m);
		
		int d = cal.get(Calendar.DATE); //일
		
		System.out.println(y+"/"+m+"/"+d); //2020/8/6 
		
		
		//요일은 일(1)~토(7)의 정수형으로 반환
		int w = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		
		
		String[] week= {"일","월","화","수","목","금","토"};
		System.out.println(y+"/"+m+"/"+d+" "+" "+week[w-1]);
	}
}
