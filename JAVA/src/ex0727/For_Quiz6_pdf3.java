package ex0727;

import java.util.Scanner;

public class For_Quiz6_pdf3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� ������ �Է� �ϼ���...");
		
		int odd, even; 
		odd = even = 0;
		
		for(int i = 0; i<10; i++)
		{
			int num  = 0;
			num = sc.nextInt();
			if(num % 2 == 0)
				even++;
			else odd++;
		}
		
		System.out.println("Ȧ���� ���� : "+odd);
		System.out.println("¦���� ���� : "+even);
		
		sc.close();
	}
}
