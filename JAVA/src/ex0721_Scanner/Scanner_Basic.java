package ex0721_Scanner;

import java.util.Scanner;

public class Scanner_Basic {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //스캐너 객체의 인스턴스 생성
		//sc라는 인스턴스 생성하고 new로 메모리 할당
		
		String name; 
		int age;
		char gender;
		double height;
		/*
		 변수형을 선언 하고 출력 안하면  !표시 생김
		 */
		
		System.out.print("이름은 ? ");
		name = sc.next(); //공백없는 문자열 입력
		
		System.out.print("나이는 ? ");
		age = sc.nextInt(); //정수 입력
		
		System.out.print("성별은 ? [M/F] ");
		gender = sc.next().charAt(0); //한 문자 입력
		
		System.out.print("키는 ? ");
		height = sc.nextDouble(); //실수 입력
		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " +age);
		System.out.println("성별 : " +gender);
		System.out.println("키 : " + height);
		
		sc.close();
	}
}
