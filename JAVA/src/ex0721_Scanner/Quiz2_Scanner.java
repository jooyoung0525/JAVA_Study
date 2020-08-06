package ex0721_Scanner;

import java.util.Scanner;

public class Quiz2_Scanner {
	public static void main(String[] args) {
		
		//이름과 국어 영어 점수를 입력 받아 총점 구하기
		//출력은 println 사용 할 것.
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int Korean, English;
		
		System.out.print("이름 ? ");
		name = sc.next();
		
		System.out.print("국어 ? ");
		Korean = sc.nextInt();
		
		System.out.print("영어 ? ");
		English = sc.nextInt();
		
		System.out.println(name+"님의 총점은 "+(Korean+English)+"점입니다.");
		
		sc.close();
	}

}
