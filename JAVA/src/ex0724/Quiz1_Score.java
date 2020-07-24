package ex0724;

import java.util.Scanner;

public class Quiz1_Score {
	public static void main(String[] args) {
		//점수를 입력 받아 입력 받은 점수에 따른 판정을 구하는 프로그램을 작성하시오.
		
		/*
		 * [처리 조건]
		 * switch문 사용
		 * 점수의 입력은 nextInt()사용
		 * 점수의 입력은 0~100사이의 수 입력된다는 가정하에 작성
		 * 판정은 다음과 같다.
		 * 90~100 : 수
		 * 80~89  : 우
		 * 70~70  : 미
		 * 60~69  : 양
		 * 0~59   :가
		 * */
		Scanner sc = new Scanner(System.in);

		int score;

		System.out.print("점수 ? ");
		score = sc.nextInt();

		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("점수 : " + score + ", 판정 : 수");
			break;
		case 8:
			System.out.println("점수 : " + score + ", 판정 : 우");
			break;
		case 7:
			System.out.println("점수 : " + score + ", 판정 : 미");
			break;
		case 6:
			System.out.println("점수 : " + score + ", 판정 : 양");
			break;
		default:
			System.out.println("점수 : " + score + ", 판정 : 가");
		}
		sc.close();
	}
}
