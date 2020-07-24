package ex0724;

import java.util.Scanner;

public class While_Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s1, s2, n;

		// 1+(1+2)+(1+2+3)+...+(1+2+...+10)
		s1 = s2 = n = 0;

		while (n < 10) {
			n++;
			s1 += n;
			s2 += s1;
		}
		System.out.println(s2);
		
		sc.close();
	}
}
