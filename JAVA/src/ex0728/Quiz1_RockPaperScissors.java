package ex0728;

import java.util.Scanner;

public class Quiz1_RockPaperScissors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int com = (int)(Math.random()*3)+1; //1:���� 2:���� 3:��
			int user;
			
			do {
				System.out.print("1.����  2.����  3.��  4.��������  =>");
				user = sc.nextInt();
			}while(user<1 || user>4);
			
			if(user == 4)
			{
				System.out.println("��������...");
				break;
			}
			
			System.out.println("��� : " + ((user == 1)?"����":(user == 2?"����":"��")));
			System.out.println("��ǻ�� : " + ((com == 1)?"����":(com == 2?"����":"��")));
			
			if(user == 1)
				System.out.println(com == 1?"�����ϴ�.":(com==2?"����� �����ϴ�.":"����� �̰���ϴ�."));
			
			else if(user == 2)
				System.out.println(com == 1?"����� �̰���ϴ�.":(com==2?"�����ϴ�.":"����������ϴ�."));
	
			else if(user == 3)
				System.out.println(com == 1?"����� �����ϴ�.":(com==2?"����� �̰���ϴ�.":"�����ϴ�."));
		}
		
		sc.close();
	}
}
