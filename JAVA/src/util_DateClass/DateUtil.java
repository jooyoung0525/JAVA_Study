package util_DateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	
	/**
	 * 기준 날짜의 몇일째 되는 날을 구하는 메소드
	 * @param strDate 기준날짜
	 * @param days 몇일째 되는 날을 계산할 인자
	 * @return     몇일후의 날짜
	 */
	public String toDaysLater(String strDate, int days) {
		String result = null;
		
		try {
			strDate = strDate.replaceAll("(\\.|\\-|/)", "");
			int y = Integer.parseInt(strDate.substring(0,4));
			int m = Integer.parseInt(strDate.substring(4,6));
			int d = Integer.parseInt(strDate.substring(6,8));
			
			Calendar cal = Calendar.getInstance();
			cal.set(y,m-1,d);
			
			cal.add(Calendar.DATE, days);
			
			//방법1
			result = String.format("%tF", cal);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 * 특정 날짜의 다음 날짜를 구하는 메소드
	 * @param strDate 특정날짜 //2020-12-31 
	 * @return 특정날짜의 다음날짜 //2021-1-1
	 */
	public String afterDays(String strDate) {
		String result = null;
		
		result = toDaysLater(strDate,1);
		return result;
	}
	
	
	public String beforeDays(String strDate) {
		String result = null;
		
		result = toDaysLater(strDate,-1);
		return result;
	}
	
	
	
	/*//주민번호 검사
	 * 234567 892345
	 * 950525-222399 9
	 * tot = 2*9 + 3*5 +....
	 * n = 11 - tot%11 >> 1~11
	 * n = n%10; //0~9
	 *
	 *마지막번호와, n이 같으면 맞는번호
	 * */
	
	/**
	 * 주민번호 체크
	 * @param rrn 주민번호
	 * @return 주민번호가 맞는지 틀린지 true,false로 리턴
	 */
	public boolean isRrnCheck(String rrn) {
		boolean result = false;
		
		int[] check = new int[] {2,3,4,5,6,7,8,9,2,3,4,5};
		int tot,n,lastNum,chkNum;
		
		rrn=rrn.replaceAll("\\-","");
		if(rrn.length()!=13) return result;
		
		
		tot = 0;
		for(int i = 0; i<12; i++) {
			n = Integer.parseInt(rrn.substring(i,i+1));
			tot += (n*check[i]);
		}
		
		lastNum = Integer.parseInt(rrn.substring(12));
		chkNum = 11-tot%11;
		chkNum = chkNum%10;
		
		result = lastNum == chkNum;
		
		return result;
	}
	
	
	/**
	 * 날짜형식이 올바른지 체크하는 메소드
	 * @param strDate
	 * @return
	 */
	public boolean isDateCheck(String strDate) {
		boolean result = false;
		Calendar sdf = Calendar.getInstance();
	
		try {
			strDate = strDate.replaceAll("(\\.|\\-|/)", "");
			int y = Integer.parseInt(strDate.substring(0,4));
			int m = Integer.parseInt(strDate.substring(4,6));
			int d = Integer.parseInt(strDate.substring(6,8));
			
			if(strDate.length()!=8)return result;
			if(y>=00&&y<=99) {
				if(m>=1 && m<=12) {
					int lastd = sdf.getActualMaximum(Calendar.DATE);
					if(d>=1 && d<=lastd) {
						result = true;
						return result;
					}
				}
			}
			
			
			/*
			 * 입력받은 수를 캘린더에 넣고 다시 가져왔을 때, 입력받은수와 같으면 같은날짜
			 * sdf.set(y,m-1,d);
			 * result = cal.get(Calendar.YEAR)==y && cal.get(Calendar.MONTH)+1 ==m && cal.get(Calendar.DATE)==d
			 * 
			 * */
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
