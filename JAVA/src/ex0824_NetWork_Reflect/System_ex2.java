package ex0824_NetWork_Reflect;

import java.util.Scanner;

public class System_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int n;
			while(true) {
				System.out.print("수?");
				n = sc.nextInt();
				if(n == 0) {
					//return; //finally 블럭 실행
					System.exit(0); //프로그램 강제종료 -> finally 실행안됨.
				}
				System.out.println("입력 값: "+n);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("final block...");
			sc.close();
		}
	}
}
