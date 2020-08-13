package addr2_teacher;

import java.util.Calendar;

public class DateUtil {
	public boolean isValidDate(String date) {
		try {
			date = date.replaceAll("(\\-|\\.|/)", "");
			if(date.length()!=8)
				return false;
			
			int y = Integer.parseInt(date.substring(0,4));
			int m = Integer.parseInt(date.substring(4,6));
			int d = Integer.parseInt(date.substring(6));
			
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR,y);
			cal.set(Calendar.MONTH,m-1);
			cal.set(Calendar.DATE,d);
			
			int y1=cal.get(Calendar.YEAR);
			int m1=cal.get(Calendar.MONTH)+1;
			int d1=cal.get(Calendar.DATE);
			
			if(y!=y1||m!=m1||d!=d1) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public int toAge(String birth) {
		int age=-1;
		
		if(! isValidDate(birth)) {
			return -1;
		}
		
		try {
			Calendar now = Calendar.getInstance();
			
			int y = Integer.parseInt(birth.substring(0,4));
			int m = Integer.parseInt(birth.substring(4,6));
			int d = Integer.parseInt(birth.substring(6));
			
			age = now.get(Calendar.YEAR) - y;
			if((m>now.get(Calendar.MONTH)+1) || (m == now.get(Calendar.MONTH)+1 && d > now.get(Calendar.DAY_OF_MONTH))) {
				age--;
			}
		} catch (Exception e) {
			return -1;
		}
		
		return age;
	}
	
}
