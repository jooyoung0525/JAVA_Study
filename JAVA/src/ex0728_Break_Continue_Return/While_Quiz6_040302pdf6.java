package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class While_Quiz6_040302pdf6 {
	public static void main(String[] args) {
		
		//1~100������ ������ �߻����� �� ���� ���ߴ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int com = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
	
		while(true) {
			int num;
			System.out.print("�� ? ");
			num = sc.nextInt();
			cnt++;
			
			if(num == com) {
				System.out.println(cnt+"�� ���� �����߽��ϴ�.");
				break;
			}
			
			System.out.println(num>com ? "�Է��� �����ٴ� ������ �Դϴ�.": "�Է��� �����ٴ� ū�� �Դϴ�.");
			
		}
		
		sc.close();
	}
}
