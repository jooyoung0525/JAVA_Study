package ex0724_Switch;

import java.util.Scanner;

public class Switch_Default2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		
		System.out.println("정수?");
		n = sc.nextInt();
		
		/*
		switch(n%2) {
		case 0 : s="짝수"; break;
		case 1 : s="홀수"; break;
		}
		System.out.println(n+":"+s);// 컴파일 오류 -> case에 쓰레기 값이 들어가서 
		*/

		//위의 경우, s를 초기화 하거나 default사용
		
		
		switch(n%2) {
		case 1 : s="홀수"; break;
		default: s="짝수"; break;
		}
		System.out.println(n+":"+s); 
		
		sc.close();
	}

}
