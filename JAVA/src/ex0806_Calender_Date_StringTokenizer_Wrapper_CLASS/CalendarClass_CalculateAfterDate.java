package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;

public class CalendarClass_CalculateAfterDate {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //2020-08-06
		
		
		
		//몇주차인지 구하기
		System.out.println("몇주차? "+cal.get(Calendar.WEEK_OF_MONTH)); //2
		
		//마지막일자 구하기
		System.out.println("마지막일자는? "+cal.getActualMaximum(Calendar.DATE)); //31
		
		
		
		
		//1970년 1월 1일부터 지금까지의 날짜차이를 ms로 변환
		long ms = cal.getTimeInMillis();
		System.out.println(ms);
		
		
		
		
		
		
		// (Quiz.1) 2020년 7월 10일에 경태씨가 여자친구를 만났다. 100일후는?
		
		// 2020년 7월 10일
		cal.set(2020,6-1,14);
		System.out.printf("%tF",cal); //2020-07-10
		
		//100일 후
		cal.add(Calendar.DATE, 100);
		System.out.printf("\n%tF",cal); 
		
		
		//2020년 8월 35일
		cal.set(2020,8-1,35); //알아서 달력 계산
		System.out.printf("\n%tF",cal); //2020-09-04
		
		
		
	}
}
