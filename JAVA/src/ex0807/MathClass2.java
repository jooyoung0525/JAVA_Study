package ex0807;

import java.util.Random;

public class MathClass2 {
	public static void main(String[] args) {
			Random rd = new Random();
			int n;
			
			for(int i = 0; i<10; i++) {
				for(int j = 0; j<10; j++) {
					//n = rd.nextInt(100); //0~99����
					n = rd.nextInt(100)+1; //1~99����
					System.out.printf("%4d",n);
				}
				System.out.println();
			}
	}
}
