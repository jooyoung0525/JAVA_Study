package ex0804;

import java.util.Scanner;

public class Play {
	public static void menu() {
		System.out.println("---------선택----------");
		System.out.println("1.가위  2.바위  3.보  4.종료");
		System.out.println("----------------------");
		System.out.println("선택[1~4]?");
	}
	public static String convertText(int n) {
		String s;
		s = n==1?"가위":n==2?"바위":"보";
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com,user;
		
		while(true) {
			
			do {
				menu();
				user = sc.nextInt();
			}while(user<1 || user>4);
			
			if(user == 4)break;
			com = (int)(Math.random()*3)+1;
			
			System.out.println("컴퓨터 :" + convertText(com));
			System.out.println("유저 :" + convertText(user));
			
			if(user == com)
				System.out.println("비겼습니다.");
			else if((user-com)==-2 || (user-com)==1){
				System.out.println("유저 승...");
			}else
				System.out.println("컴퓨터 승...");
		}
		
		sc.close();
	}
}