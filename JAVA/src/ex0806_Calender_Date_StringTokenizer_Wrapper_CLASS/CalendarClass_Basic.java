package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;

public class CalendarClass_Basic {
	public static void main(String[] args) {
		
		//Calendar�� �߻� Ŭ������ ���� ��ü�� ������ �� ����.
		
		//<<��ü ���� ���-1 :�ý����� ��¥�� ��ü�� ����>>
		Calendar cal = Calendar.getInstance();
		
		String s = String.format("%tF %tA %tT",cal,cal,cal); //%tF : ����� , %tF : ���� , %tT :�ð�
		System.out.println(s);
		
		
		//<<�⵵,��,���� �ϳ��� �и�>>
		int y = cal.get(Calendar.YEAR);  //�⵵
		//System.out.println(y);
		
		//���� 0~11�ι�ȯ
		int m = cal.get(Calendar.MONTH)+1;  //��
		//System.out.println(m);
		
		int d = cal.get(Calendar.DATE); //��
		
		System.out.println(y+"/"+m+"/"+d); //2020/8/6 
		
		
		//������ ��(1)~��(7)�� ���������� ��ȯ
		int w = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		
		
		String[] week= {"��","��","ȭ","��","��","��","��"};
		System.out.println(y+"/"+m+"/"+d+" "+" "+week[w-1]);
	}
}
