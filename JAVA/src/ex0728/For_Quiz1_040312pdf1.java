package ex0728;

import java.util.Scanner;

public class For_Quiz1_040312pdf1 {
	public static void main(String[] args) {
		//7에 가장 가까운 최솟값 구하기
		Scanner sc = new Scanner(System.in);
		
		int n,min = 0;
		int b, result = 0;
		
		System.out.println("5개의 정수 입력...");
		
		for(int i = 0; i<5; i++) {
			
			n = sc.nextInt();
			
			b = n>7?n-7:7-n;
			
			if(i == 0 || min > b) {
				min = b;
				result = n;
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
