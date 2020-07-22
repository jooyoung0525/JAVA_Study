package ex0721;

import java.util.Scanner;

public class Scanner_Sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int c;
		
		System.out.print("두 수 ? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a+b;
		
		System.out.printf("%d + %d = %d",a,b,c);
		
		sc.close(); //Scanner 닫힘을 안해주면 오류가 발생할 가능성이 있음
 	}

}
