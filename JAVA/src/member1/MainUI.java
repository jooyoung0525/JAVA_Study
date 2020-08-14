package member1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainUI {
	private Scanner sc=new Scanner(System.in);
	private Member member = new MemberImpl(); //멤버객체 생성 후
	private Login login = new LoginImpl(member); //로그인 객체에 넘김!
	
	private GuestUI guestUI = new GuestUI(member, login); //로그인 안된 UI
	private MemberUI memberUI = new MemberUI(member, login); //로그인 된  UI

	public void menu() { //메뉴도 두개로 분류
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
				System.out.print("1.로그인 2.회원가입 3.종료 => ");
				ch = sc.nextInt();
			} while(ch<1 || ch>3);
			
			if(ch==3) {
				System.exit(0); //리턴하면 프로그램 안죽음...
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
			
			System.out.print("["+login.loginMember().getName()+"] 님");
			do {
				System.out.print("1.정보수정 2.회원검색 3.로그아웃 4.회원탈퇴 5.리스트 => ");
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
