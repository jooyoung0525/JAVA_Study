package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass_MakeCalendar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		
		
		/*
		int y,m,w;
		
		System.out.print("�⵵ ?");
		y=sc.nextInt();
		
		do {
			System.out.print("�� ?");
			m = sc.nextInt();
		}while(m<1||m>12);
		
		cal.set(y,m-1,1); //y�⵵ m�� 1�Ϸ� ��¥ ����
		w = cal.get(Calendar.DAY_OF_WEEK); // 1(��)~7(��)
		
		System.out.println("\t"+y+"�� "+m+"��");
		System.out.println("     ��       ��       ȭ      ��     ��      ��      ��");
		System.out.println("===============================");
		
		//1�� �պκ� ���� ó��
		for(int i = 1; i<w; i++) {
			System.out.print("    ");
		}
		
		int last_day = cal.getActualMaximum(Calendar.DATE);
		for(int i = 1; i<=last_day; i++) {
			System.out.printf("%4d",i);
			if(++w % 7 == 1) {
				System.out.println();
			}
		}
		if(w%7 != 1)System.out.println();
		
		System.out.println("===============================");
		
		*/
		sc.close();
	}
}
