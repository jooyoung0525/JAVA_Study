package ex0724;

import java.util.Scanner;

public class Quiz3_Year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year, month, day;
		System.out.print("년도 ?");
		year = sc.nextInt();
		System.out.print("월 ?");
		month = sc.nextInt();

		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31; break;
		case 4 : case 6: case 9: case 11: day = 30; break;
		case 2: 
			day = (year%4 == 0 && (year % 100 != 0 || year % 400 == 0)? 29:28); //if로 작성해도 됨!
			break;
		default :  day = -1; //월을 잘못 입력했을 때
		}
		
		if(day < 0) System.out.println("입력 오류...");
		else
			System.out.println(year+"년 "+month+"월은 "+day+"일까지 있습니다.");
		
		sc.close();
	}
}
