package ex0728;

import java.util.Scanner;

public class While_Quiz7_040302pdf7 {
	public static void main(String[] args) {
		//���� ������ �Է� �޾� �Է� ���� ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("�� ? ");
			num=sc.nextInt();
		}while(num<0);
		 
		System.out.println("������ �� : "+num);
		
		System.out.print("������ �� : ");
		while(true) {
			System.out.printf("%d",num%10);
			num/=10;
			if(num <= 0)break;
		}
		
		sc.close();
	}
}
