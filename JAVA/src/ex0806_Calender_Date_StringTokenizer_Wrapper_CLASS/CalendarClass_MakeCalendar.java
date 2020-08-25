package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarClass_MakeCalendar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		
		
		/*
		int y,m,w;
		
		System.out.print("년도 ?");
		y=sc.nextInt();
		
		do {
			System.out.print("월 ?");
			m = sc.nextInt();
		}while(m<1||m>12);
		
		cal.set(y,m-1,1); //y년도 m월 1일로 날짜 설정
		w = cal.get(Calendar.DAY_OF_WEEK); // 1(일)~7(토)
		
		System.out.println("\t"+y+"년 "+m+"월");
		System.out.println("     일       월       화      수     목      금      토");
		System.out.println("===============================");
		
		//1일 앞부분 공백 처리
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
