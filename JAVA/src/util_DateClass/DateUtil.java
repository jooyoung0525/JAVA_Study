package util_DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

//예외처리를 배운 후 수정해야함.
public class DateUtil {
	
	/**
	 * 문자열의 날짜를 Date형으로 변환하는 메소드
	 * @param strDate Date형으로 변경할 문자열의 날짜
	 * @return 문자열이 Date객체로 변경된 객체
	 */
	public Date toDate(String strDate) {
		Date date = null;
		
		try {
			strDate = strDate.replaceAll("(\\-|\\.|/)",""); //정규식 안에 쓰는 예약어 . - 이기 때문에 문자라고 명시
			
			if(strDate.length()!=8) {
				return null;
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			date = sdf.parse(strDate);
				
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return date;
	}
	
	
	
	/**
	 * Date형을 String 형의 문자열로 변환하여 반환
	 * @param date 문자열로 변환할  Date객체
	 * @return 문자열로 변환된 날짜
	 */
	public String toString(Date date) {
		String s = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		s = sdf.format(date);
		
		return s;
	}
	
	
	/**
	 * 두 날짜 사이의 차이(endDate-startDate)를 일자로 반환
	 * @param startDate
	 * @param endDate
	 * @return 날짜사이의 차이
	 */
	public int toDiffDays(String startDate, String endDate) {
		int diff = 0;
		
		try {
			startDate = startDate.replaceAll("(\\-|\\.|/)", "");
			endDate = endDate.replaceAll("(\\-|\\.|/)", "");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			
			Date begin = sdf.parse(startDate);
			Date end = sdf.parse(endDate);
			
			//전체를 형변환하는 이유는 50억/(1000*60*60*24)하면 크기가 확 줄어서 정상값이 리턴
			diff = (int)((end.getTime()-begin.getTime()) / (1000*60*60*24));
			
			/*
			diff = ((int)(end.getTime()-begin.getTime()) / (1000*60*60*24));
			==> 오류나는 이유
			    end.getTime()-begin.getTime() ==> 50 억이라고 하면 int범위를 넘기때문에 짤려나감
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return diff;
	}
}
