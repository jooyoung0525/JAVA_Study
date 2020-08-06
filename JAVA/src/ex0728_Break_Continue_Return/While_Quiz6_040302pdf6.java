package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class While_Quiz6_040302pdf6 {
	public static void main(String[] args) {
		
		//1~100까지의 난수를 발생시켜 몇 번에 맞추는지 출력하는 프로그램을 작성하시오.
		int com = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
	
		while(true) {
			int num;
			System.out.print("수 ? ");
			num = sc.nextInt();
			cnt++;
			
			if(num == com) {
				System.out.println(cnt+"번 만에 성공했습니다.");
				break;
			}
			
			System.out.println(num>com ? "입력한 수보다는 적은수 입니다.": "입력한 수보다는 큰수 입니다.");
			
		}
		
		sc.close();
	}
}
