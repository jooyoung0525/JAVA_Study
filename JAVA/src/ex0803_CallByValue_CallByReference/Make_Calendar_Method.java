package ex0803_CallByValue_CallByReference;

public class Make_Calendar_Method {
	public static void main(String[] args) {
		MyCalendar User = new MyCalendar();
		
		//isLeapYear �޼ҵ� ���Ȯ��
		System.out.println(User.isLeapYear(2020));
		
		//monthly_days �޼ҵ� ���Ȯ��
		System.out.println(User.monthly_days(2020, 8));
		
		//days_of_week �޼ҵ� ���Ȯ��
		System.out.println(User.days_of_week(2020,8,3));
		
		
		MyCal cal = new MyCal();
		String s;
		s = cal.isYeap(2020)? "����":"���";
		System.out.println(s);
	}
}

//�ʵ� ���� �޼ҵ常 �����
class MyCalendar {

	int days[] = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	String []WeekOfDay = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	// �������� �ƴ��� �Ǻ��ϴ� �޼ҵ� ==> boolean���� ¥�� ������ ������ �������� ����� ��� �ֱ� ����
	                             // 2���� 28�ϱ������� 29�ϱ�������...
	public boolean isLeapYear(int year) {

		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? true : false;
	}

	
	// �ش� ���� ���ϱ��� �ִ��� ����ϴ� �޼ҵ�
	public int monthly_days(int year, int month) {

		//int days[] = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// ������ 2���� 29�ϱ���
		//days[2] = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28;
		days[2]=isLeapYear(year) ? 29:28;
		
		return days[month];
	}

	
	// ������ ������������ ����ϴ� �޼ҵ�
	public String days_of_week(int year, int month, int day) {

		
		//int days[] = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// ������ 2���� 29�ϱ���
		//days[2] = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? 29 : 28;
		days[2]=isLeapYear(year) ? 29:28;
		
		// 1.1.1~year-1.12.31���� ��¥ ��
		int total = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		// year.1.1~year.month-1.�������� ���� ��¥��
		for (int i = 1; i < month; i++)
			total += days[i];
		// year.month-1.�������� ~ year.month.day
		total += day;

		
		return WeekOfDay[total%7];
	}
}

//������ Ŭ����
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