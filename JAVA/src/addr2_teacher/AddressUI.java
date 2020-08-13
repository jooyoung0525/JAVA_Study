package addr2_teacher;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressUI {
	private Scanner sc=new Scanner(System.in);
	private Address addr=new AddressImpl();
	private DateUtil util=new DateUtil();

	public void menu() {
		int ch;
		
		while(true) {
			try {
				do {
					System.out.print("1.��� 2.���� 3.���� 4.�̸��˻� 5.����Ʈ 6.���� => ");
					ch=sc.nextInt();
				} while(ch<1||ch>6);
				
				if(ch==6) {
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: findByName(); break;
				case 5: list(); break;
				}
			} catch (InputMismatchException e) {
				sc.nextLine();
			} catch (Exception e) {
			}
		}
	}
	
	public void insert() {
		System.out.println("\n[������ ���]");
		
		// �̸��� ��ȭ��ȣ�� ������ ��� ��� �Ұ�
		AddressVO vo=new AddressVO();
		
		System.out.print("�̸� ? ");
		vo.setName(sc.next());

		System.out.print("��ȭ��ȣ ? ");
		vo.setTel(sc.next());
		
		if(addr.readAddress(vo.getName(), vo.getTel())!=null) {
			System.out.println("��ϵ� ���� �Դϴ�.\n");
			return;
		}

		System.out.print("������� ? ");
		vo.setBirth(sc.next());
		if(! util.isValidDate(vo.getBirth())) {
			System.out.println("������� ������ ��ġ���� �ʽ��ϴ�.\n");
			return;
		}

		System.out.print("�ּ� ? ");
		vo.setAddr(sc.next());
		
		addr.insertAddress(vo);
		
		System.out.println("��� �Ϸ�.\n");
		
	}
	
	public void update() {
		System.out.println("\n[������ ����]");
		
		String name, tel;
		System.out.print("�˻��� �̸� ? ");
		name = sc.next();

		System.out.print("�˻��� ��ȭ��ȣ ? ");
		tel = sc.next();
		
		AddressVO vo = addr.readAddress(name, tel);
		if(vo==null) {
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
			return;
		}

		System.out.print("���ο� �̸� ? ");
		name = sc.next();

		System.out.print("��ȭ��ȣ ? ");
		tel = sc.next();
		AddressVO vo1 = addr.readAddress(name, tel);
		
		if(vo1!=null && vo!=vo1) {
			System.out.println("��ϵ� ���� �Դϴ�.\n");
			return;
		}
		
		vo.setName(name);
		vo.setTel(tel);

		System.out.print("������� ? ");
		vo.setBirth(sc.next());
		if(! util.isValidDate(vo.getBirth())) {
			System.out.println("������� ������ ��ġ���� �ʽ��ϴ�.\n");
			return;
		}
		
		System.out.print("�ּ� ? ");
		vo.setAddr(sc.next());
		
		System.out.println("���� �Ϸ�.\n");
	}

	public void delete() {
		System.out.println("\n[������ ����]");
		
		String name, tel;
		System.out.print("������ �̸� ? ");
		name = sc.next();

		System.out.print("������ ��ȭ��ȣ ? ");
		tel = sc.next();
		
		boolean b = addr.deleteAddress(name, tel);
		if(! b) {
			System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.\n");
			return;
		}
		
		System.out.println("�ڷᰡ ���� �Ǿ����ϴ�.\n");
	}
	
	public void list() {
		System.out.println("\n��ü ����Ʈ...");
		
		List<AddressVO> list=addr.listAddress();
		for(AddressVO vo : list) {
			System.out.println(vo+"\t"+util.toAge(vo.getBirth()));
		}
		System.out.println();
	}
	
	public void findByName() {
		System.out.println("\n�̸� �˻�...");
		
		String name;
		
		System.out.print("�˻��� �̸� ? ");
		name=sc.next();
		
		List<AddressVO> list = addr.listAddress(name);
		
		if(list.size()==0) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}
		
		for(AddressVO vo : list) {
			System.out.println(vo+"\t"+util.toAge(vo.getBirth()));
		}
		System.out.println();
	}
}
