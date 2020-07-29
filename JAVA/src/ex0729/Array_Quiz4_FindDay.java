package ex0729;

import java.util.Scanner;

public class Array_Quiz4_FindDay {
	public static void main(String[] args) {
		
		//년,월,일을 입력받아 요일 구하기
		//1년 1월 1일 : 월요일
		//366(2월 29일):년도가 4의배수이고 100의배수가아니거나 400의배수일때
		//365(2월 28일)
		
		Scanner sc = new Scanner(System.in);
		
		
		//1월=> days[0].... 12=>days[11]
		int []days = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] weeks = new String[] {"일","월","화","수","목","금","토"};
		
		int y,m,d;
		int total; 
		String w;
		
		do {
			System.out.print("년도?");
			y=sc.nextInt();
		}while(y<100);
		
		do {
			System.out.print("월?");
			m=sc.nextInt();
		}while(m<1||m>12);
		
		//y년도의 2월은 몇일까지?
		days[1] = y%4==0 && y%100!=0 || y%400==0 ? 29 : 28;
		
		do {
			System.out.print("일?");
			d=sc.nextInt();
		}while(d<1||d>days[m-1]);
		
		
		//1.1.1 ~ y.m.d 일까지의 전체 날수
		//1.1.1 ~ 2019.12.31
		//전체날 수 = 2019*365 + (2019/4) - (2019/100) + (2019/400);
		
		total = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
	
		for(int i = 0; i<m-1; i++)
			total += days[i];
		
		total+=d;
		
		
		
		w= weeks[total%7];
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n",y,m,d,w);
		
		sc.close();
	}
}
