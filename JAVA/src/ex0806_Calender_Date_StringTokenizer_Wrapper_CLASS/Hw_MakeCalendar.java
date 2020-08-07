package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;
import java.util.Scanner;

public class Hw_MakeCalendar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] week = new String[]{"��","��","ȭ","��","��","��","��"};
		
		int preLastDay,day,last_day; 
		
		int y,m;
		System.out.print("�⵵ ?");
		y = sc.nextInt();
		
		do {
			System.out.print("�� ?");
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		Calendar cal = Calendar.getInstance();
		cal.set(y,m-1,1); 
		last_day = cal.getActualMaximum(Calendar.DATE);
		
		System.out.println("\t"+y+"�� "+m+"��");
		for(int i = 0; i<week.length; i++) {
			System.out.printf("%6s",week[i]);
		}
		System.out.println();
		System.out.println("===============================");
		
		preLastDay = 0;
		for(int w = 1; w<7; w++) { //�Ѵ��� �ִ� 6��
			cal.set(Calendar.WEEK_OF_MONTH,w);//������ ��¥�� �� ����
			cal.set(Calendar.DAY_OF_WEEK,1);//�ش� �� �Ͽ��� ����
			if(cal.get(Calendar.YEAR)>y||cal.get(Calendar.MONTH)>=m)
				break;
		
			/*
		int sy = cal.get(Calendar.YEAR);
		int sm = cal.get(Calendar.MONTH)+1;
		int sd = cal.get(Calendar.DAY_OF_MONTH);
		
		cal.set(Calendar.DAY_OF_WEEK,7);
		int ey = cal.get(Calendar.YEAR);
		int em = cal.get(Calendar.MONTH)+1;
		int ed = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d�� : %04d-%02d-%02d ~ %04d-%02d-%02d\n",w,sy,sm,sd,ey,em,ed);
		}*/
		
			if(w==1&&cal.get(Calendar.MONTH)+1!=m) { 
				preLastDay = cal.getActualMaximum(Calendar.DATE);
			}
			
			day = cal.get(Calendar.DAY_OF_MONTH);
			for(int i = 0; i<7; i++) {
				System.out.printf("%4d",day);
				day++;
				
				if(w==1 && preLastDay != 0 && preLastDay<day) {
					day = 1;
				}else if(last_day < day){
					day = 1;
				}
			}
			System.out.println();
			
			if(w==1) {
				// 1�������� ó�� �������ڰ� �������̸�
				// cal�� �������� ��Ÿ���Ƿ� ��¥ �缳���� �ʿ�
				cal.set(y,m-1,1);
			}
		}
		sc.close();
	}
}
