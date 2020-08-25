package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass_FindLiveDate {
	public static void main(String[] args) {
		//현재 시스템의 날짜로 객체 생성
		Date date = new Date();
		System.out.println(date); //미국식
		
		//1970.1.1 0:0:0 이후부터 시간을 ms로 환산
		System.out.println(date.getTime());
		
		
		
		/* <<사용을 권장하지 않음>>
		//getYear: 다른거 쓰라고 자바에서 경고!!
		int y = date.getYear()+1900;
		int m = date.getMonth()+1;
		int d = date.getDate();
		System.out.println(y+"-"+m+"-"+d); //120-7-6 (년도+1900)
		*/
		
		//1970.1.1 0:0:0초를 기준으로 밀리초 계산하여 그 결과를 날짜로 환원
		Date date2 = new Date(11250340568L);
		System.out.println(date2);
		
		
		//date가 date2보다 이후 날짜이면 true
		System.out.println(date.after(date2));
		
		
		//Date 객체의 값을 String으로 변환하여 출력하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		String s;
		s = sdf.format(date2); // Date -> String
		System.out.println(s);
		
		try {
			//1993-04-25문자열을 Date형으로 변환
			String ss ="1992-01-10";
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			//parse :  String -> Date로 변환
			Date date3 = sdf2.parse(ss); //컴파일 오류. -> parse는 반드시 예외처리필요
			//System.out.println(date3); // Sun Apr 25 00:00:00 KST 1993
			
			Date sdate = new Date(); //오늘 날짜
			long diff = sdate.getTime()- date3.getTime();
			diff = diff / (24*60*60*1000); //하루,시,분,초 순서
			System.out.println("석우가 오늘까지 산 날짜: "+diff);
			
			
			
		}catch (Exception e) {
			//예외가 발생하는 경우 이 블럭 안의 내용을 실행
			e.printStackTrace();
		}
	}
}
