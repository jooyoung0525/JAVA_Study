package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class Break_Ex2_While {

	public static void main(String[] args) {
	
		// �Ǽ��� �Է� �޾� �Է� ���� ���� �� ���ϱ�
		// ��, �Է� ���� ���� 0���ϸ� ���� ����ϰ� ����
		
		Scanner sc = new Scanner(System.in);
		
		double input,s;
		
		s = 0;
		
		while(true) {
			System.out.print("�Ǽ��� �Է��ϼ���.");
			input = sc.nextDouble();
			if(input <= 0) {	
				break;
			}
			s+=input;
		}
		
		System.out.println("��� : "+s);
		sc.close();
	}

}
