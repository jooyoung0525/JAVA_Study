package ex0812_Exception_Generic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s, n;
		try {
			while(true) {
				System.out.println("��[0:����]");
				n=sc.nextInt();
				if(n==0) {
					break;
				}
				s =0;
				for(int i =1;i<=n;i++) {
					s+=i;
				}
				System.out.println("���:"+s);
			}
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է� ����");
		}
		System.out.println("����...");
		
		sc.close();//�����δ� finally ��Ͽ��� ó��
	}

}
