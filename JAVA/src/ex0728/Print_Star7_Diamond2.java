package ex0728;

import java.util.Scanner;

public class Print_Star7_Diamond2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size, n;
		
		do {
			System.out.print("È¦¼ö?");
			size = sc.nextInt();
		}while(size<1||size%2==0);
		
		n = size/2;
		
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<(size-n); j++) {
				System.out.print((j>=n)?"*":" ");
			}
			n=i<(size/2)? n-1: n+1;
			System.out.println();
		}
		
		sc.close();
	}
}
