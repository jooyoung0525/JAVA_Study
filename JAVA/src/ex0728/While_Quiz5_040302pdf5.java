package ex0728;

import java.util.Scanner;

public class While_Quiz5_040302pdf5 {
	public static void main(String[] args) {	
		//�ݾ��� �Է� �޾� �Է� ���� �ݾ��� 50000�� �ǿ��� 1�� �Ǳ��� ȭ��ż��� �� �������� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		 
		int money, standm;
		System.out.print("�ݾ� ? ");
		
		money = sc.nextInt();
		standm = 50000;
		
		boolean flag = false;
		
		while(true)
		{
			int cnt = money / standm;
			money %= standm;
			
			if(standm <= 1)break;
			
			System.out.println(standm+"����/���� : "+cnt);
			
			if(!flag)
			{
				standm /=5;
				flag = true;
			}
			else {
				standm/=2;
				flag = false;
			}
		}
		
		sc.close();
	}
}
