package ex0721_Scanner;

import java.util.Scanner;

public class Scanner_blank {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //�ǹ������� Scanner�� �Է¹��� ����
		
		String name,birth,tel;
		int age;
		
		System.out.print("�̸�? : ");
		name = sc.nextLine(); //���� �Է� ��������� �߸��ϸ� ���ϴ� ����� ������ ���� �� ����
	
		System.out.print("����? : ");
		age = sc.nextInt();
		sc.nextLine(); //�̰� �������� ��, age�� ���ʹ� birth�� ����Ǿ �ǳʶ�.
		               //sc.nextLine() ������ �� -> ���ۿ� ���� ���� �а� ����
		
		/*
		 next -> ���� : ������ --> ��� �Է¿Ϸ��� ��  //���� �о�� ����
		 nextLine -> ���ͱ��� ���� �� ����
		*/
		
		System.out.print("�������? : ");
		birth = sc.nextLine();
		
		System.out.print("��ȭ��ȣ? : ");
		tel = sc.nextLine();
		
		System.out.println(name+","+age+","+birth+","+tel);
		
		sc.close();
		
	}
}
 