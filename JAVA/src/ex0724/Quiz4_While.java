package ex0724;

import java.util.Scanner;

public class Quiz4_While {

	public static void main(String[] args) {
		//정수를 입력 받아 입력받은 수까지의 합, 3의배수의 합을 출력하는 프로그램 계산
		//수? 100
		//1~100 까지의 합 : xxx
		//1~100까지 3의 배수의 합 : xxx
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수?");
		int num, cnt, hap, three_hap;
		num= sc.nextInt();
		
		cnt = hap = three_hap = 0;
		
		while(cnt < num) {
			cnt++;
			hap+=cnt;
			if(cnt % 3 == 0)
				three_hap+=cnt;
		}

		System.out.println("1~"+num+"까지의 합 : "+ hap);
		System.out.println("1~"+num+"까지 3의 배수의 합 : "+ three_hap);
		
		sc.close();
	}
}
