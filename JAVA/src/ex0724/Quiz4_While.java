package ex0724;

import java.util.Scanner;

public class Quiz4_While {

	public static void main(String[] args) {
		//������ �Է� �޾� �Է¹��� �������� ��, 3�ǹ���� ���� ����ϴ� ���α׷� ���
		//��? 100
		//1~100 ������ �� : xxx
		//1~100���� 3�� ����� �� : xxx
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��?");
		int num, cnt, hap, three_hap;
		num= sc.nextInt();
		
		cnt = hap = three_hap = 0;
		
		while(cnt < num) {
			cnt++;
			hap+=cnt;
			if(cnt % 3 == 0)
				three_hap+=cnt;
		}

		System.out.println("1~"+num+"������ �� : "+ hap);
		System.out.println("1~"+num+"���� 3�� ����� �� : "+ three_hap);
		
		sc.close();
	}
}
