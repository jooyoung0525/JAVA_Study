package ex0724_Switch;

import java.util.Scanner;

public class While_Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		double s;
		
		n = 0;
		s = 0;
		// 1/2 + 2/3 + 3/4 ...9/10
		while(n<9) {
			n++; 
			s+=(double)n/(n+1); //�ڹٴ� �⺻ ���������� ��� -> double�� ����ȯ �ʿ�!
		}
		
		System.out.println(s);
		
		sc.close();
	}
}
