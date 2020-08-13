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
					System.out.print("1.등록 2.수정 3.삭제 4.이름검색 5.리스트 6.종료 => ");
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
		System.out.println("\n[데이터 등록]");
		
		// 이름과 전화번호가 동일한 경우 등록 불가
		AddressVO vo=new AddressVO();
		
		System.out.print("이름 ? ");
		vo.setName(sc.next());

		System.out.print("전화번호 ? ");
		vo.setTel(sc.next());
		
		if(addr.readAddress(vo.getName(), vo.getTel())!=null) {
			System.out.println("등록된 정보 입니다.\n");
			return;
		}

		System.out.print("생년월일 ? ");
		vo.setBirth(sc.next());
		if(! util.isValidDate(vo.getBirth())) {
			System.out.println("생년월일 형식이 일치하지 않습니다.\n");
			return;
		}

		System.out.print("주소 ? ");
		vo.setAddr(sc.next());
		
		addr.insertAddress(vo);
		
		System.out.println("등록 완료.\n");
		
	}
	
	public void update() {
		System.out.println("\n[데이터 수정]");
		
		String name, tel;
		System.out.print("검색할 이름 ? ");
		name = sc.next();

		System.out.print("검색할 전화번호 ? ");
		tel = sc.next();
		
		AddressVO vo = addr.readAddress(name, tel);
		if(vo==null) {
			System.out.println("등록된 자료가 아닙니다.\n");
			return;
		}

		System.out.print("새로운 이름 ? ");
		name = sc.next();

		System.out.print("전화번호 ? ");
		tel = sc.next();
		AddressVO vo1 = addr.readAddress(name, tel);
		
		if(vo1!=null && vo!=vo1) {
			System.out.println("등록된 정보 입니다.\n");
			return;
		}
		
		vo.setName(name);
		vo.setTel(tel);

		System.out.print("생년월일 ? ");
		vo.setBirth(sc.next());
		if(! util.isValidDate(vo.getBirth())) {
			System.out.println("생년월일 형식이 일치하지 않습니다.\n");
			return;
		}
		
		System.out.print("주소 ? ");
		vo.setAddr(sc.next());
		
		System.out.println("수정 완료.\n");
	}

	public void delete() {
		System.out.println("\n[데이터 삭제]");
		
		String name, tel;
		System.out.print("삭제할 이름 ? ");
		name = sc.next();

		System.out.print("삭제할 전화번호 ? ");
		tel = sc.next();
		
		boolean b = addr.deleteAddress(name, tel);
		if(! b) {
			System.out.println("등록된 자료가 아닙니다.\n");
			return;
		}
		
		System.out.println("자료가 삭제 되었습니다.\n");
	}
	
	public void list() {
		System.out.println("\n전체 리스트...");
		
		List<AddressVO> list=addr.listAddress();
		for(AddressVO vo : list) {
			System.out.println(vo+"\t"+util.toAge(vo.getBirth()));
		}
		System.out.println();
	}
	
	public void findByName() {
		System.out.println("\n이름 검색...");
		
		String name;
		
		System.out.print("검색할 이름 ? ");
		name=sc.next();
		
		List<AddressVO> list = addr.listAddress(name);
		
		if(list.size()==0) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		
		for(AddressVO vo : list) {
			System.out.println(vo+"\t"+util.toAge(vo.getBirth()));
		}
		System.out.println();
	}
}
