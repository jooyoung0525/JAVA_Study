package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;

public class CalendarClass_FindFirstAndLastDate {
	public static void main(String[] args) {
		
		//�ش� ��¥�� ����ִ� ������ �����ϰ� ������ �������� ���
		int y = 2020;
		int m = 8;
		int d = 31;
		int w;
		
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,d);
		//System.out.printf("%tF",cal);
		
		
		//��ü ����(���ο� ��ü�� �����Ͽ� �ʵ�� ���� ���� ������)
		Calendar scal = (Calendar)cal.clone();
		//System.out.println(cal==scal); //false , clone�� �ּҰ��� �����ϴ� ���� �ƴ�.
		
		w = scal.get(Calendar.DAY_OF_WEEK)-1; //���ϱ��ϱ�
		scal.add(Calendar.DATE, w*(-1));
		
		System.out.printf("�� ���� :%tF\n",scal);
		
		
		Calendar ecal = (Calendar)cal.clone();
		w = ecal.get(Calendar.DAY_OF_WEEK); 
		ecal.add(Calendar.DATE, (7-w));
		System.out.printf("�� ������ : %tF\n",ecal);
	}
}
