package addresslist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressUI {
	private Scanner sc = new Scanner(System.in);
	private Address ad = new AddressImpl();
	
	public void menu() {
		
		int ch;
		
		while(true) {
			
			try {
				do {
					System.out.println("1.등록   2.수정   3.삭제   4.이름검색   5.리스트   6.종료  =>");
					ch = sc.nextInt();
					
				}while(ch<1 || ch>6);
				
				if(ch == 6)return;
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update();break;
				case 3: delete();break;
				case 4: findByName();break;
				case 5: printList();break;
				case 6: break;
				}
				
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("숫자를 입력하세요.");
			}
		}
	}
	
	
	
	
	public void insert() {
		System.out.println("\n데이터 추가...");
		
		AddressVO vo = new AddressVO(); //새로 저장할 객체
		
		String name;
		System.out.print("이름 ?");
		name = sc.next();
		AddressVO last = ad.readAddress(name);
		
		String birth;
		System.out.print("생년월일을 8자리 입력하세요 ?");
		birth = sc.next();
		birth = birth.replaceAll("(\\-|\\.|/)", "");
		if(birth.length()!=8) {
			System.out.println("잘못된 생년월일 입니다.");
			return;
		}
		
		
		String phone;
		System.out.print("전화번호 ?");
		phone = sc.next();
		phone.replaceAll("-", "");
		
		if(last!=null && last.getPhone()==phone ) {
			System.out.println("이미 등록된 정보 입니다.");
			return;
		}
		
		String address;
		System.out.print("주소 ?");
		address=sc.next();
		
		
		Calendar cal = Calendar.getInstance();
		String registerdate = String.format("%1$tF", cal);
		Calendar b = Calendar.getInstance();
		int y = Integer.parseInt(birth.substring(0,4));
		int m = Integer.parseInt(birth.substring(4,6));
		int d = Integer.parseInt(birth.substring(6,8));
		b.set(y, m-1, d);
		
		int age = cal.get(Calendar.YEAR)-b.get(Calendar.YEAR);
		
		vo.setName(name);
		vo.setPhone(phone);
		vo.setBirth(birth);
		vo.setAge(age);
		vo.setAddress(address);
		vo.setRegisterdate(registerdate);
		
		ad.insertAddress(vo);
	}
	
	
	
	
	public void update() {
		System.out.println("\n데이터 수정...");
		
		String name;
		System.out.print("수정할 이름 ?");
		name = sc.next();
		AddressVO last = ad.readAddress(name);
		
		String phone;
		System.out.print("전화번호 ?");
		phone = sc.next();
		phone.replaceAll("-", "");
		
		if(last==null || last.getPhone() != phone) {
			System.out.println("등록 정보가 없습니다.");
			return;
		}
		
		String birth;
		System.out.print("생년월일을 8자리 ?");
		
		birth = sc.next();
		birth = birth.replaceAll("(\\.|\\-|/)", "");	
		do {
			System.out.println("잘못된 생년월일 입니다.(0000-00-00형식으로 입력하세요)");
			birth = sc.next();
			birth = birth.replaceAll("(\\.|\\-|/)", "");	
		}while(birth.length()>8);
		last.setBirth(birth);
		
		System.out.print("등록할 전화번호 ?");
		phone = sc.next();
		phone.replaceAll("-", "");
		last.setPhone(phone);
		
		String address;
		System.out.print("주소 ?");
		address=sc.next();
		last.setAddress(address);
		
		Calendar cal = Calendar.getInstance();
		Calendar b = Calendar.getInstance();
		int y = Integer.parseInt(birth.substring(0,4));
		int m = Integer.parseInt(birth.substring(4,6));
		int d = Integer.parseInt(birth.substring(6,8));
		b.set(y, m-1, d);
		
		int age = cal.get(Calendar.YEAR)-b.get(Calendar.YEAR);
		last.setAge(age);
	}	
	
	
	
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
		
		
		String name;
		System.out.print("삭제할 이름 ?");
		name = sc.next();
		AddressVO last = ad.readAddress(name);
		
		String phone;
		System.out.print("전화번호 ?");
		phone = sc.next();
		phone.replaceAll("-", "");
		
		if(last==null || last.getPhone() != phone) {
			System.out.println("삭제할 정보가 없습니다.");
			return;
		}
		
		boolean isdel = ad.deleteAddress(name, phone);
		if(isdel) {
			System.out.println("삭제완료...");
			return;
		}
		System.out.println("삭제 실패...");
		
	}
	

	
	
	
	public void findByName() {
		System.out.println("\n이름 검색...");
		
		String name;
		System.out.print("검색할 이름 ?");
		name = sc.next();
		
		List<AddressVO> list = ad.listAddress(name);
		
		if(list.size()== 0) {
			System.out.println("검색할 자료가 없습니다.");
			return;
		}
		
		for(AddressVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}
	
	
	
	
	
	public void printList() {
		System.out.println("\n전체 리스트...");
		List<AddressVO> list = new ArrayList<>();
		list = ad.listAddress();
		
		for(AddressVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}
}
