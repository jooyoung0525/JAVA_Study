package ex0804;

import java.util.Scanner;

public class Play {
	public static void menu() {
		System.out.println("---------����----------");
		System.out.println("1.����  2.����  3.��  4.����");
		System.out.println("----------------------");
		System.out.println("����[1~4]?");
	}
	public static String convertText(int n) {
		String s;
		s = n==1?"����":n==2?"����":"��";
		return s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int com,user;
		
		while(true) {
			
			do {
				menu();
				user = sc.nextInt();
			}while(user<1 || user>4);
			
			if(user == 4)break;
			com = (int)(Math.random()*3)+1;
			
			System.out.println("��ǻ�� :" + convertText(com));
			System.out.println("���� :" + convertText(user));
			
			if(user == com)
				System.out.println("�����ϴ�.");
			else if((user-com)==-2 || (user-com)==1){
				System.out.println("���� ��...");
			}else
				System.out.println("��ǻ�� ��...");
		}
		
		sc.close();
	}
}