package ex0727;

import java.util.Scanner;

public class DoWhile_ex3 {
	public static void main(String[] args) {
		//1~9������ ���� �Է� �޾� �Է� ���� ���� ������ ���
		//��, �Է� ���� ���� 1~9������ ���� �ƴϸ� �ٽ� �Է� �޴´�.
		
		//��?10
		//��?3
		//3*1 = 3 ...
		
		int dan,n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//do ~ while �̿�
		/*
		do {
			System.out.println("��? ");
			dan = sc.nextInt();
		}while(dan < 1 || dan > 9);*/
		
		
		//while �̿�
		System.out.println("��? ");
		dan = sc.nextInt();
		while(dan<1 || dan> 9)
		{
			System.out.println("��? ");
			dan=sc.nextInt();
		}
		
		
		n = 0;
		while(n<9) {
			n++;
			System.out.printf("%d * %d = %d\n",dan,n,dan*n);
		}
		
		sc.close();
		
	}
}
