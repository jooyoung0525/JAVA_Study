package ex0824_NetWork_Reflect;

import java.util.Scanner;

public class System_ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int n;
			while(true) {
				System.out.print("��?");
				n = sc.nextInt();
				if(n == 0) {
					//return; //finally �� ����
					System.exit(0); //���α׷� �������� -> finally ����ȵ�.
				}
				System.out.println("�Է� ��: "+n);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("final block...");
			sc.close();
		}
	}
}
