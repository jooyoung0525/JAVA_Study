package ex0727;

import java.util.Scanner;

public class While_Quiz1_Sum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, hap1, hap2, hap3, s;
		System.out.println("수 ?");
		num = sc.nextInt();
		
		hap1 = hap2 = hap3= s = 0;
		while(s < num) {
			s++;
			hap1+=s;
			
			if(s%2==0)
				hap2+=s;
			else
				hap3+=s;
		} 
		
		System.out.println("1~입력까지의 합: "+hap1);
		System.out.println("1~입력까지의 짝수 합: "+hap2);
		System.out.println("1~입력까지의 홀수 합: "+hap3);
		sc.close();
	}
}
