package ex0727;

import java.util.Scanner;

public class For_Quiz5_pdf2 {
	public static void main(String[] args) {
		//���� �Է¹޾� �ش� �������� ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("�� ? ");
		num=sc.nextInt();
		
		for(int i = 1; i<=9; i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
		
		sc.close();
	}
}
