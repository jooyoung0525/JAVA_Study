package ex0727_For_DoWhile_While_Random;

import java.util.Scanner;

public class For_Quiz4_pdf1 {
	public static void main(String[] args) {
		//정수를 입력 받아 1에서 입력 받은 수까지의 합을 구하는 프로그램을 작성
		Scanner sc = new Scanner(System.in);
		int num, hap;
		
		do{
			System.out.print("수[1~1000] ?");
			num = sc.nextInt();	
		}while(num<1||num>1000);
		
		hap = 0;
		
		for(int i = 1; i<num+1; i++) {
			hap+=i;
		}
		
		System.out.println("1~"+num+"까지 합 : "+hap);
		
		sc.close();
	}
}
