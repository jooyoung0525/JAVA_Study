package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class Return_Ex1 {
	public static void main(String[] args) {
		//����� �Է� �޾� �Է� ���� ������ �� ���ϱ�
		//�Է� ���� ���� 0���� ���ų� ������ ����
		
		Scanner sc = new Scanner(System.in);
		int n,s;
		
		System.out.print("��?");
		n = sc.nextInt();
		
		/*
		// ���1
		if(n>0) {
			s = 0;
			for(int i = 1; i<=n; i++) {
				s+=i;
			}
			System.out.println("��� : "+s);	
		}*/
		
		//���2
		if(n<=0) {
			sc.close();
			return; //thread�� ���̴� ���� �ƴϱ� ������ ���α׷��� ���̴°� �ƴ�.
		}
		
		s = 0;
		for(int i = 1; i<=n; i++) {
			s+=i;
		}
		System.out.println("��� : "+s);	
		
		
		sc.close();
	}
}
