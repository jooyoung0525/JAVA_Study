package ex0724_Switch;

import java.util.Scanner;

public class While_Practice2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int s,n,num;
		
		
		System.out.print("����?");
		num = sc.nextInt();
		
		//1���� �Է� ���� ������ �ձ��ϱ�
		/*
		s = n = 0;
		while(n<num) {
			n++;
			s+=n;
		}
		System.out.println("1~"+num+" ���� ��: "+s);
		*/
		
		//1���� �Է� ���� ������ Ȧ�� �� ���ϱ�
		s = 0; n = 1;
		while(n<=num) {
			s+=n;
			n+=2;
		}
		
		System.out.println("1~"+num+" ������ Ȧ�� ��: "+s);
		sc.close();
	}
}
