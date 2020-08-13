package ex0812_Exception_Generic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throws_Ex1 {
	public static void main(String[] args) {
		User11 uu = new User11();
		uu.input();
	}
}

class User11 {
	private Scanner sc = new Scanner(System.in);

	private int inputScore() throws Exception {
		//runtime exception 있을 수 있는 메소드
		//throws 발생된 예외를 호출한 곳에 떠넘기는 것
		//throw 예외를 발생 시키는 것
		int n = 0;

		try {
			n = sc.nextInt();
			if(n<0||n>100) {
				throw new Exception("점수는 0~100 이어야합니다.");
				//checked 는 캐치해야함
			}
		} catch (InputMismatchException e) {
			sc.nextLine(); // 잘못 입력된 것을 읽어서 버림
			//nextInt 는 \n 엔터전까지의 입력값을 출력하고 \n은 버퍼에 남아 있기때문에
			//다음 nextLine을 수행시 바로 넘어가게됨.
//			next()<->nextLine() : 공백이랑 엔터까지 허용
//			System.out.println("숫자가 아닙니다.");
			throw e;
		}

		return n;
	}

	public void input() {
		System.out.println("성적처리..");
		String name;
		int kor, eng;
		int tot;
		
		try {
			
			System.out.print("이름?");
			name = sc.next();
			
			System.out.print("국어?");
			kor = inputScore();
			
			System.out.print("영어?");
			eng = inputScore();

			tot = kor + eng;
			System.out.println(name + ":" + tot + "점");
		} catch (InputMismatchException e) {
			//	e.printStackTrace();
			System.out.println("점수는 숫자만 가능");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}