package ex0727;

import java.util.Scanner;

public class For_Quiz1 {
	public static void main(String[] args) {
		//������ �Է� �޾� �Է� ���� ������ Ȧ�� �� ���ϱ�
		//�� �Է� ���� ���� 1���� ������ �ٽ� �Է� �޴´�.
		
		Scanner sc = new Scanner(System.in);
		
		int n,hap;
	
		do {
			System.out.print("����?");
			n = sc.nextInt();
		}while(n<1);
		
		hap=0;
		for(int i = 1; i<=n; i+=2)
		{
			hap+=i;
		}
		
		System.out.println("Ȧ�� ��: " + hap);
		
		sc.close();
	}
}
