package ex0728;

import java.util.Scanner;

public class While_Quiz2_040302pdf2 {
	public static void main(String[] args) {
		//정수를 입력 받아 입력 받은 정수가 몇 자리 정수인지를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		 
		int num, cnt, start;
		System.out.print("수 ? ");
		start= sc.nextInt();
		
		num = start;
		num = num > 0 ? num : -num;
		
		cnt = 0;
		while(true) {
			num/=10;
			cnt++;
			if(num == 0)break;
		}
		
		System.out.println(num+"은 "+cnt+"자리 정수");
		sc.close();
	}
}
