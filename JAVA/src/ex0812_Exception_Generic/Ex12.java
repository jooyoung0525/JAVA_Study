package ex0812_Exception_Generic;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int a = 0;
//		try {
//			System.out.print("����?");
//			a = sc.nextInt();
//			System.out.println("a: " + a);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			sc.close();
//		}
		
		
		int a;
		//try~with~resources
		//JDK 7���� ����. �ڵ� 
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("����?");
			a = sc.nextInt();
			System.out.println("a: " + a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
