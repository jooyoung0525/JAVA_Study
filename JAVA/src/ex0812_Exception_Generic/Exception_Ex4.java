package ex0812_Exception_Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception_Ex4 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader : 문자열을 입력받을 수 있는 문자 입력 스트림 일종

		String name;
		int age;

		try {
			System.out.print("이름?");
			name = br.readLine();
			System.out.println("나이?");
			age = Integer.parseInt(br.readLine());
			System.out.println(name + ":" + age);
		} catch (IOException e) {
			// IOException : 입출력시 발생하는 예외를 나타내는 checked exception
			// 반드시 예외처리해야함
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// NumberFormatException : unchecked exception
//			e.printStackTrace();
			System.out.println("나이는 숫자만 입력 가능...");
		} finally {
			//예외 발생 유무와 상관없이 실행
			System.out.println("언제나 실행...");
		}
		System.out.println("종료...");
	}
}
