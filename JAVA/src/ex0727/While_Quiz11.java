package ex0727;

import java.util.Scanner;

public class While_Quiz11 {
	public static void main(String[] args) {
		//������ �Է� �޾� �Է¹��� ������ ���ڸ� �������� ��� -- while���� �̿�
		//�� ? 123
		//3�ڸ� ����
		
		//��? -123
		//3�ڸ� ����
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ?");
		
		int num, cnt;
		num = sc.nextInt();
		cnt = 0;
		
		if(num < 0) num = num * -1;
		
		while(0 != num) {
			
			num /= 10;
			cnt++;
		}
		
		System.out.println(cnt+"�ڸ� ����");
		
		sc.close();
	}
}
