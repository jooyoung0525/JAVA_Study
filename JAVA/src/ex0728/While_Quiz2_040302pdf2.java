package ex0728;

import java.util.Scanner;

public class While_Quiz2_040302pdf2 {
	public static void main(String[] args) {
		//������ �Է� �޾� �Է� ���� ������ �� �ڸ� ���������� ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		 
		int num, cnt, start;
		System.out.print("�� ? ");
		start= sc.nextInt();
		
		num = start;
		num = num > 0 ? num : -num;
		
		cnt = 0;
		while(true) {
			num/=10;
			cnt++;
			if(num == 0)break;
		}
		
		System.out.println(num+"�� "+cnt+"�ڸ� ����");
		sc.close();
	}
}
