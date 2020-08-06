package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass_CalculateMeetDate {
	public static void main(String[] args) {
		
		//웹개발에서 클라이언트는 string형으로밖에 작성못해서 바꿀수 있어야함!!
		//SimpleDateFormat은  Date -> String, String -> Date 가능하게 함!
		
		// 경태씨가 2019년 10월 5일에 여자친구를 만났다.
		// 2020-12-25까지 몇일일까???
		
		try {
			String s = "2019-10-05";
			SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
			Date meet = sd.parse(s); //string -> Date
			
			String e = "2020-12-25";
			SimpleDateFormat ed = new SimpleDateFormat("yyyy-MM-dd");
			Date chris = ed.parse(e); //string -> Date
			
			long diff = chris.getTime() - meet.getTime();
			diff /= (24*60*60*1000);
			
			System.out.println("2020년도 클스마스까지 사귀면 몇일일까? :"+diff);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
