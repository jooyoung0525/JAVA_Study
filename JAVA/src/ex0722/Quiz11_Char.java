package ex0722;

import java.util.Scanner;

public class Quiz11_Char {
	public static void main(String[] args) {
		/*
		 * �� ���ڸ� �Է� �޾� �Է� ���� ���ڰ� �ҹ����̸� �빮�ڷ� ��ȯ�ϰ�,�빮���̸� �ҹ��ڷ� ��ȯ�Ѵ�.
		 * ��, �Է� ���� ���ڰ� �����ڰ� �ƴϸ� �Է¹��� ���ڸ� �״�� ����Ѵ�.
		 * 
		 * �ѹ��� ? a
		 * a -> A
		 * 
		 * �� ���� ? 7
		 * 7 -> 7
		 * 
		 * �ҹ��ڿ� �빮���� ASCII�ڵ� ���̴� 32�̴�.
		 * */
		Scanner sc = new Scanner(System.in);
		char a,b;
		int anum;
		
		System.out.print("�ѹ��� ? ");
		a = sc.next().charAt(0);
		
		anum = a;
		b = anum >=65 && anum <= 91 ? (char)(anum+32) : ((anum >=97 && anum <=123) ? (char)(anum-32) : a);
		//b = a >='A' && a <= 'Z' ? (char)(a+32) : ((a >= 'a' && a <= 'z') ? (char)(a-32) : a);
		
		System.out.println(a+" -> "+b);
		sc.close();
	}
}
