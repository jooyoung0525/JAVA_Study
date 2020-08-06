package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;

public class CalendarClass_FindFirstAndLastDate {
	public static void main(String[] args) {
		
		//해당 날짜가 들어있는 한주의 시작일과 한주의 마지막일 계산
		int y = 2020;
		int m = 8;
		int d = 31;
		int w;
		
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,d);
		//System.out.printf("%tF",cal);
		
		
		//객체 복사(새로운 객체를 생성하여 필드와 같은 값을 갖도록)
		Calendar scal = (Calendar)cal.clone();
		//System.out.println(cal==scal); //false , clone은 주소값을 복사하는 것이 아님.
		
		w = scal.get(Calendar.DAY_OF_WEEK)-1; //요일구하기
		scal.add(Calendar.DATE, w*(-1));
		
		System.out.printf("주 시작 :%tF\n",scal);
		
		
		Calendar ecal = (Calendar)cal.clone();
		w = ecal.get(Calendar.DAY_OF_WEEK); 
		ecal.add(Calendar.DATE, (7-w));
		System.out.printf("주 마지막 : %tF\n",ecal);
	}
}
