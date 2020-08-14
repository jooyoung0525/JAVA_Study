package member1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainUI {
	private Scanner sc=new Scanner(System.in);
	private Member member = new MemberImpl(); //�����ü ���� ��
	private Login login = new LoginImpl(member); //�α��� ��ü�� �ѱ�!
	
	private GuestUI guestUI = new GuestUI(member, login); //�α��� �ȵ� UI
	private MemberUI memberUI = new MemberUI(member, login); //�α��� ��  UI

	public void menu() { //�޴��� �ΰ��� �з�
		while(true) {
			if(login.loginMember()==null) {
				menuGuest();
			} else {
				menuMember();
			}
		}
	}
	
	private void menuGuest() {
		try {
			int ch;
			
			do {
				System.out.print("1.�α��� 2.ȸ������ 3.���� => ");
				ch = sc.nextInt();
			} while(ch<1 || ch>3);
			
			if(ch==3) {
				System.exit(0); //�����ϸ� ���α׷� ������...
			}
			
			switch(ch) {
			case 1: guestUI.login(); break;
			case 2: guestUI.register(); break;
			}
			
		} catch (InputMismatchException e) {
			sc.nextLine();
		}
	}
	
	private void menuMember() {
		try {
			int ch;
			
			System.out.print("["+login.loginMember().getName()+"] ��");
			do {
				System.out.print("1.�������� 2.ȸ���˻� 3.�α׾ƿ� 4.ȸ��Ż�� 5.����Ʈ => ");
				ch = sc.nextInt();
			} while(ch<1 || ch>5);
			
			switch(ch) {
			case 1: memberUI.update(); break;
			case 2: memberUI.findByName(); break;
			case 3: login.logout(); System.out.println(); break;
			case 4: memberUI.delete(); break;
			case 5: memberUI.listAll(); break;
			}
			
		} catch (InputMismatchException e) {
			sc.nextLine();
		}
	}
}
