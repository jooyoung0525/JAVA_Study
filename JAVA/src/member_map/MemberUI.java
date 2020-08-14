package member_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

public class MemberUI {
	
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private Member mem = new MemberImpl();
	public DateUtil dd = new DateUtil();
	
	public void menu() {
		
		while(true) {
			
			try {
				
				char ch;
				
				do {
					System.out.println("1.회원가입  2.정보수정  3.탈퇴  4.아이디검색  5.리스트  6.종료  =>");
					ch = br.readLine().charAt(0);
				}while(ch<'1'||ch>'7');
				
				
				if(ch == '6') {
					System.exit(0); //프로그램 종료
				}
				
				switch(ch) {
				case'1':insert();break;
				case'2':update();break;
				case'3':delete();break;
				case'4':findById();break;
				case'5':list();break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	public void insert() {
		System.out.println("1. 회원 가입... \n");
		
		try {
			MemberVO vo = new MemberVO();
			String Id;
			String Birth;
			
			System.out.print("아이디 ? ");
			Id =br.readLine();
			
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("패스워드 ? ");
			vo.setName(br.readLine());
			
			System.out.print("생년월일 ? ");
			Birth =br.readLine();
			if(!dd.isValidDate(Birth)) {
				System.out.println("잘못된 생년월일 입니다.\n");
				return;
			}
			vo.setBirth(Birth);
			
			System.out.print("전화번호 ? ");
			vo.setName(br.readLine());
			
			boolean b = mem.insertInfo(Id, vo);
			if(!b) {
				System.out.println("중복된 아이디가 있습니다.\n");
				return;
			}
			
			System.out.println("회원가입에 성공하였습니다.\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void update() {
		System.out.println("2. 회원정보 수정... \n");
		
	}
	
	public void delete() {
		System.out.println("3. 회원 탈퇴... \n");
		
		try {
			String Id;
			Id = br.readLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void findById() {
		System.out.println("4. 아이디 검색... \n");
		
		try {
			String Id;	
			System.out.print("검색할 아이디 ? ");
			Id =br.readLine();
			
			MemberVO vo = mem.readMember(Id);
			
			if(vo == null) {
				System.out.println("해당 아이디는 존재하지 않습니다.\n");
				return;
			}
			
			System.out.print(Id+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getPassword()+"\t");
			System.out.print(vo.getBirth()+"\t");
			System.out.print(vo.getPhonenum()+"\t");
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void list() {
		System.out.println("5. 리스트... \n");
		
		Map<String,MemberVO>map = mem.listMember();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String Id = it.next();
			MemberVO vo = map.get(Id);
			System.out.print(Id+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getPassword()+"\t");
			System.out.print(vo.getBirth()+"\t");
			System.out.print(vo.getPhonenum()+"\t");
			System.out.println();
		}
		System.out.println();
	}
}
