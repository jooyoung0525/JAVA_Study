package ex0727;

import java.util.Scanner;

public class While_Quiz11 {
	public static void main(String[] args) {
		//정수를 입력 받아 입력받은 정수가 몇자리 정수인지 출력 -- while문을 이용
		//수 ? 123
		//3자리 정수
		
		//수? -123
		//3자리 정수
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 ?");
		
		int num, cnt;
		num = sc.nextInt();
		cnt = 0;
		
		if(num < 0) num = num * -1;
		
		while(0 != num) {
			
			num /= 10;
			cnt++;
		}
		
		System.out.println(cnt+"자리 정수");
		
		sc.close();
	}
}
