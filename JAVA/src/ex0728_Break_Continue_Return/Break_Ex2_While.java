package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class Break_Ex2_While {

	public static void main(String[] args) {
	
		// 실수를 입력 받아 입력 받은 수의 합 구하기
		// 단, 입력 받은 수가 0이하면 합을 출력하고 종료
		
		Scanner sc = new Scanner(System.in);
		
		double input,s;
		
		s = 0;
		
		while(true) {
			System.out.print("실수를 입력하세요.");
			input = sc.nextDouble();
			if(input <= 0) {	
				break;
			}
			s+=input;
		}
		
		System.out.println("결과 : "+s);
		sc.close();
	}

}
