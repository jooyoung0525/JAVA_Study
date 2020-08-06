package ex0803_CallByValue_CallByReference;

public class Make_Calendar_Method {
	public static void main(String[] args) {
		MyCalendar User = new MyCalendar();
		
		//isLeapYear 메소드 출력확인
		System.out.println(User.isLeapYear(2020));
		
		//monthly_days 메소드 출력확인
		System.out.println(User.monthly_days(2020, 8));
		
		//days_of_week 메소드 출력확인
		System.out.println(User.days_of_week(2020,8,3));
		
		
		MyCal cal = new MyCal();
		String s;
		s = cal.isYeap(2020)? "윤년":"평년";
		System.out.println(s);
	}
}

//필드 없이 메소드만 만들기
class MyCalendar {

	int days[] = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	String []WeekOfDay = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	// 윤년인지 아닌지 판별하는 메소드 ==> boolean으로 짜는 이유는 윤년이 여러가지 기능을 담고 있기 때문
	                             // 2월이 28일까지인지 29일까지인지...
	public boolean isLeapYear(int year) {

		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
	}

	
	// 해당 월이 몇일까지 있는지 계산하는 메소드
	public int monthly_days(int year, int month) {

		//int days[] = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 윤년은 2월이 29일까지
		//days[2] = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28;
		days[2]=isLeapYear(year) ? 29:28;
		
		return days[month];
	}

	
	// 오늘이 무슨요일인지 계산하는 메소드
	public String days_of_week(int year, int month, int day) {

		
		//int days[] = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 윤년은 2월이 29일까지
		//days[2] = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28;
		days[2]=isLeapYear(year) ? 29:28;
		
		// 1.1.1~year-1.12.31까지 날짜 수
		int total = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		// year.1.1~year.month-1.마지막날 까지 날짜수
		for (int i = 1; i < month; i++)
			total += days[i];
		// year.month-1.마지막날 ~ year.month.day
		total += day;

		
		return WeekOfDay[total%7];
	}
}

//선생님 클래스
	class MyCal {
		
		
		public boolean isYeap(int year) {
			return year%4==0 && year%100!=0 || year%400==0;
		}
		
		public int lastMonthDay(int year, int month) {
			
			int[] mm = {31,28,31,30,31,30,31,31,30,31,30,31};
			
			mm[1] = isYeap(year) ? 29:28;
			
			return mm[month-1];
		}
		
		
	}