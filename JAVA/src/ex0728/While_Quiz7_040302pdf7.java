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
		
		int cpy = num;
		int divnum = 10;
		
		while(cpy>0)
		{
			cpy/=10;
		}
		
		System.out.print("������ �� : ");
		while(true) {
			int resultn = num%divnum;
			System.out.printf("%d",resultn);
			num/=10;
			if(num <= 0)break;
		}
		
		sc.close();
	}
}
