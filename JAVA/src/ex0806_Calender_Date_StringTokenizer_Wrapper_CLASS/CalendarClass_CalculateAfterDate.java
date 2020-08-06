package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;

public class CalendarClass_CalculateAfterDate {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //2020-08-06
		
		
		
		//���������� ���ϱ�
		System.out.println("������? "+cal.get(Calendar.WEEK_OF_MONTH)); //2
		
		//���������� ���ϱ�
		System.out.println("���������ڴ�? "+cal.getActualMaximum(Calendar.DATE)); //31
		
		
		
		
		//1970�� 1�� 1�Ϻ��� ���ݱ����� ��¥���̸� ms�� ��ȯ
		long ms = cal.getTimeInMillis();
		System.out.println(ms);
		
		
		
		
		
		
		// (Quiz.1) 2020�� 7�� 10�Ͽ� ���¾��� ����ģ���� ������. 100���Ĵ�?
		
		// 2020�� 7�� 10��
		cal.set(2020,6-1,14);
		System.out.printf("%tF",cal); //2020-07-10
		
		//100�� ��
		cal.add(Calendar.DATE, 100);
		System.out.printf("\n%tF",cal); 
		
		
		//2020�� 8�� 35��
		cal.set(2020,8-1,35); //�˾Ƽ� �޷� ���
		System.out.printf("\n%tF",cal); //2020-09-04
		
		
		
	}
}
