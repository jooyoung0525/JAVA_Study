package ex0728;

import java.util.Scanner;

public class While_Quiz5_040302pdf5 {
	public static void main(String[] args) {	
		//금액을 입력 받아 입력 받은 금액이 50000원 권에서 1원 권까지 화폐매수가 몇 매인지를 출력하는 프로그램을 작성 하시오.
		
		Scanner sc = new Scanner(System.in);
		 
		int money, standm;
		System.out.print("금액 ? ");
		
		money = sc.nextInt();
		standm = 50000;
		
		boolean flag = false;
		
		while(true)
		{
			int cnt = money / standm;
			money %= standm;
			
			if(standm <= 1)break;
			
			System.out.println(standm+"원권/개수 : "+cnt);
			
			if(!flag)
			{
				standm /=5;
				flag = true;
			}
			else {
				standm/=2;
				flag = false;
			}
		}
		
		sc.close();
	}
}
