package ex0724_Switch;

import java.util.Scanner;

public class Switch_Default2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		
		System.out.println("����?");
		n = sc.nextInt();
		
		/*
		switch(n%2) {
		case 0 : s="¦��"; break;
		case 1 : s="Ȧ��"; break;
		}
		System.out.println(n+":"+s);// ������ ���� -> case�� ������ ���� ���� 
		*/

		//���� ���, s�� �ʱ�ȭ �ϰų� default���
		
		
		switch(n%2) {
		case 1 : s="Ȧ��"; break;
		default: s="¦��"; break;
		}
		System.out.println(n+":"+s); 
		
		sc.close();
	}

}
