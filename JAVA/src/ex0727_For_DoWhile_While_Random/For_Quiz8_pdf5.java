package ex0727_For_DoWhile_While_Random;

import java.util.Scanner;

public class For_Quiz8_pdf5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("10���� ������ �Է� �ϼ���...");
		
		int max = -987654321; 
		
		//��� 1 ) for�� �ۿ��� �Է°��� �ѹ� �ް� for�ȿ��� �Է�9���� ������ ��.
		//��� 2 ) int max = Integer.MIN_VALUE; //���� �� ���� ���� ��!
		
		for(int i = 0; i<10; i++)
		{
			int num;
			num = sc.nextInt();
			
			if(max <= num) max = num;
		}
		
		System.out.println("�ִ밪 : "+max);
		
		
		
		/*
		 int n,s;
		 n=s =0;
		 while(n<10){
		 	n++;
		 	s+=n;
		 }
		 System.out.println(s);
		 
		 ------------------------------
		 
		 int s;
		 s = 0;
		 for(int i = 1; i<=10; i++)
		 {
		 	s+=n;
		 }
		 System.out.println(s);
		 
		 */
		
		sc.close();
	}
}
