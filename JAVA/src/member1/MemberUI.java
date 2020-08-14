package member1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MemberUI {
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private Member member;
	private Login login;
	
	public MemberUI(Member member, Login login) {
		this.member = member;
		this.login = login;
	}
	
	public void update() {
		System.out.println("\n[회원정보수정]");
		
		try {
			MemberVO vo=login.loginMember();
			if(vo==null) {
				return;
			}
			System.out.print("수정할 패스워드 ? ");
			vo.setPwd(br.readLine());

			System.out.print("생년월일 ? ");
			vo.setBirth(br.readLine());

			System.out.print("전화번호 ? ");
			vo.setTel(br.readLine());

			System.out.println("회원정보가 수정되었습니다.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void delete() {
		System.out.println("\n[회원탈퇴]");
		
		MemberVO vo=login.loginMember();
		if(vo==null) {
			return;
		}
		
		try {
			System.out.println("회원을 탈퇴 하시겠습니까? [Y/N]");
			char ch = br.readLine().charAt(0);
			if(ch!='Y'&&ch !='y') {
				return;
			}
				
			member.deleteMember(vo.getId());
			login.logout();
			
			System.out.println("회원탈퇴가 이루어졌습니다.\n");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public void listAll() {
		System.out.println("\n[회원리스트]");
		
		for(MemberVO vo : member.listMember()) {
			System.out.println(vo);
		}
		System.out.println();
	}

	public void findByName() {
		System.out.println("\n[회원검색]");
		
		try {
			String name;
			System.out.print("이름 ? ");
			name = br.readLine();
			
			for(MemberVO vo : member.listMember()) {
				if(vo.getName().startsWith(name)) {
					System.out.println(vo);
				}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
