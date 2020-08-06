package ex0721_Scanner;

import java.util.Scanner;

public class Quiz3_Printf {
	public static void main(String[] args) {
		// 정수를 입력받아 입력받은 정수를 16진수와 입력받은 정수에 해당하는(ASCII 코드)문자를 출력하시오.
		// 단, 입력 받은 정수는 0~65535 라는 가정하에 문제를 해결한다.
		/*
		 정수 ? 65
		 65 0x41 A
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int Num;
		
		System.out.print("정수 ? ");
		Num = sc.nextInt();
		
		//풀이1
		System.out.printf("%d %#x %c\n",Num,Num,Num); //#넣으면 숫자 앞에 진수표시 생성
		
		//풀이2
		System.out.printf("%1$d %1$#x %1$c\n",Num);

		sc.close();
	}
}
