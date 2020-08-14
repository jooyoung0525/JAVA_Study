package member_map;

import java.util.Calendar;

public class DateUtil {
	public boolean isValidDate(String date) {

		try {
			date = date.replaceAll("(\\.|\\-|/)", "");
			if (date.length() != 8)
				return false;

			int year, month, day;

			year = Integer.parseInt(date.substring(0, 4));
			month = Integer.parseInt(date.substring(4, 6));
			day = Integer.parseInt(date.substring(6, 8));

			Calendar now = Calendar.getInstance();
			now.set(year, month-1, day);
			
			int y = now.get(Calendar.YEAR);
			int m = now.get(Calendar.MONTH)+1;
			int d = now.get(Calendar.DATE);
			
			if(year != y || month != m || day != d) return false;
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean isValidPass(String pass) {
		
		return false;
	}
}
