package ex0724;

import java.util.Scanner;

public class While_Practice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dan, n;
		System.out.print("´Ü?");
		dan = sc.nextInt();

		n = 0;

		while (n < 9) {
			n += 1;
			System.out.printf("%d * %d = %d\n", dan, n, dan * n);
		}
		sc.close();
	}

}
