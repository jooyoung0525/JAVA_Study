package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class Continue_Ex1 {
	public static void main(String[] args) {
		//10���� ���� �Է� �޾� �Է� ���� ���� �� ���ϱ�
		//��, �Է� ���� ���� 0���ϸ� �տ� �������� �ʴ´�.
		
		Scanner sc = new Scanner(System.in);
		int n,s;
		
		s = 0;
		
		System.out.println("10���� �� �Է�");
		for(int i = 1; i<=10; i++)
		{
			n = sc.nextInt();
			if(n <= 0)continue;
			s+=n;
		}
		System.out.println("��� : " + s);
		
		sc.close();
	}
}
