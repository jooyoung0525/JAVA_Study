package member1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuestUI {
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private Member member;
	private Login login;
	
	public GuestUI(Member member, Login login) { //생성자를 이용한 의존관계 설정.
		this.member = member;
		this.login = login;
	}
	
	public void register() {
		System.out.println("\n[회원가입]");
		
		String id;
		try {
			System.out.print("아이디 ? ");
			id = br.readLine();
			
			if(member.readMember(id)!=null) {
				System.out.println("등록된 아이디 입니다.\n");
				return;
			}
			
			MemberVO vo=new MemberVO();
			vo.setId(id);
			
			System.out.print("패스워드 ? ");
			vo.setPwd(br.readLine());

			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("생년월일 ? ");
			vo.setBirth(br.readLine());

			System.out.print("전화번호 ? ");
			vo.setTel(br.readLine());

			member.insertMember(vo);
			
			System.out.println("회원가입이 성공 했습니다 로그인 하시기 바랍니다.\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void login() {
		System.out.println("\n[로그인]");
		
		String id, pwd;
		
		try {
			System.out.print("아이디 ? ");
			id = br.readLine();

			System.out.print("패스워드 ? ");
			pwd = br.readLine();
			
			if(! login.isLogin(id, pwd)) {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.\n");
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
