package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;

public class CalendarClass_CalculateAgeInFull {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //2020-08-06
		
		System.out.printf("%tF",now); //����
		//1993.4.25�� ������ ���
		Calendar cal = Calendar.getInstance();
		cal.set(1993,4-1,25);
		System.out.printf("%tA�� �¾\n",cal); //�Ͽ���
		
		int age = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR); //�߸�����!:: ������ �������� ������, ���Ͼ���������� -1�ؾ���
		
		
		
		if(cal.get(Calendar.MONTH)>now.get(Calendar.MONTH) //���� �߸����Ѱ� ��ģ��
				||(cal.get(Calendar.MONTH) == now.get(Calendar.MONTH)
				&&cal.get(Calendar.DATE)>now.get(Calendar.DATE))
				) { age--; 
				}
		
		System.out.println(age);
		
	}
}
