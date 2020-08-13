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
					System.out.println("1.���   2.����   3.����   4.�̸��˻�   5.����Ʈ   6.����  =>");
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
				System.out.println("���ڸ� �Է��ϼ���.");
			}
		}
	}
	
	
	
	
	public void insert() {
		System.out.println("\n������ �߰�...");
		
		AddressVO vo = new AddressVO(); //���� ������ ��ü
		
		String name;
		System.out.print("�̸� ?");
		name = sc.next();
		AddressVO last = ad.readAddress(name);
		
		String birth;
		System.out.print("��������� 8�ڸ� �Է��ϼ��� ?");
		birth = sc.next();
		birth = birth.replaceAll("(\\-|\\.|/)", "");
		if(birth.length()!=8) {
			System.out.println("�߸��� ������� �Դϴ�.");
			return;
		}
		
		
		String phone;
		System.out.print("��ȭ��ȣ ?");
		phone = sc.next();
		phone.replaceAll("-", "");
		
		if(last!=null && last.getPhone()==phone ) {
			System.out.println("�̹� ��ϵ� ���� �Դϴ�.");
			return;
		}
		
		String address;
		System.out.print("�ּ� ?");
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
		System.out.println("\n������ ����...");
		
		String name;
		System.out.print("������ �̸� ?");
		name = sc.next();
		AddressVO last = ad.readAddress(name);
		
		String phone;
		System.out.print("��ȭ��ȣ ?");
		phone = sc.next();
		phone.replaceAll("-", "");
		
		if(last==null || last.getPhone() != phone) {
			System.out.println("��� ������ �����ϴ�.");
			return;
		}
		
		String birth;
		System.out.print("��������� 8�ڸ� ?");
		
		birth = sc.next();
		birth = birth.replaceAll("(\\.|\\-|/)", "");	
		do {
			System.out.println("�߸��� ������� �Դϴ�.(0000-00-00�������� �Է��ϼ���)");
			birth = sc.next();
			birth = birth.replaceAll("(\\.|\\-|/)", "");	
		}while(birth.length()>8);
		last.setBirth(birth);
		
		System.out.print("����� ��ȭ��ȣ ?");
		phone = sc.next();
		phone.replaceAll("-", "");
		last.setPhone(phone);
		
		String address;
		System.out.print("�ּ� ?");
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
		System.out.println("\n������ ����...");
		
		
		String name;
		System.out.print("������ �̸� ?");
		name = sc.next();
		AddressVO last = ad.readAddress(name);
		
		String phone;
		System.out.print("��ȭ��ȣ ?");
		phone = sc.next();
		phone.replaceAll("-", "");
		
		if(last==null || last.getPhone() != phone) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		
		boolean isdel = ad.deleteAddress(name, phone);
		if(isdel) {
			System.out.println("�����Ϸ�...");
			return;
		}
		System.out.println("���� ����...");
		
	}
	

	
	
	
	public void findByName() {
		System.out.println("\n�̸� �˻�...");
		
		String name;
		System.out.print("�˻��� �̸� ?");
		name = sc.next();
		
		List<AddressVO> list = ad.listAddress(name);
		
		if(list.size()== 0) {
			System.out.println("�˻��� �ڷᰡ �����ϴ�.");
			return;
		}
		
		for(AddressVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}
	
	
	
	
	
	public void printList() {
		System.out.println("\n��ü ����Ʈ...");
		List<AddressVO> list = new ArrayList<>();
		list = ad.listAddress();
		
		for(AddressVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}
}
