package ex0728;

import java.util.Scanner;

public class For_Quiz1_040312pdf1 {
	public static void main(String[] args) {
		//7�� ���� ����� �ּڰ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		int n,min = 0;
		int b, result = 0;
		
		System.out.println("5���� ���� �Է�...");
		
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
