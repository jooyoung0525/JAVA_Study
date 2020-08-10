package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;

public class CalendarClass_CalculateAgeInFull {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //2020-08-06
		
		System.out.printf("%tF",now); //오늘
		//1993.4.25의 만나이 계산
		Calendar cal = Calendar.getInstance();
		cal.set(1993,4-1,25);
		System.out.printf("%tA에 태어남\n",cal); //일요일
		
		int age = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR); //잘못구함!:: 생일이 지났으면 맞지만, 생일안지났을경우 -1해야함
		
		
		
		if(cal.get(Calendar.MONTH)>now.get(Calendar.MONTH) //위에 잘못구한거 고친거
				||(cal.get(Calendar.MONTH) == now.get(Calendar.MONTH)
				&&cal.get(Calendar.DATE)>now.get(Calendar.DATE))
				) { age--; 
				}
		
		System.out.println(age);
		
	}
}
