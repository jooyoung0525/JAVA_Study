package ex0727_For_DoWhile_While_Random;

import java.util.Scanner;

public class For_Quiz4_pdf1 {
	public static void main(String[] args) {
		//������ �Է� �޾� 1���� �Է� ���� �������� ���� ���ϴ� ���α׷��� �ۼ�
		Scanner sc = new Scanner(System.in);
		int num, hap;
		
		do{
			System.out.print("��[1~1000] ?");
			num = sc.nextInt();	
		}while(num<1||num>1000);
		
		hap = 0;
		
		for(int i = 1; i<num+1; i++) {
			hap+=i;
		}
		
		System.out.println("1~"+num+"���� �� : "+hap);
		
		sc.close();
	}
}
