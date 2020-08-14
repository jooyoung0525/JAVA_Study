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
		System.out.println("\n[ȸ����������]");
		
		try {
			MemberVO vo=login.loginMember();
			if(vo==null) {
				return;
			}
			System.out.print("������ �н����� ? ");
			vo.setPwd(br.readLine());

			System.out.print("������� ? ");
			vo.setBirth(br.readLine());

			System.out.print("��ȭ��ȣ ? ");
			vo.setTel(br.readLine());

			System.out.println("ȸ�������� �����Ǿ����ϴ�.\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void delete() {
		System.out.println("\n[ȸ��Ż��]");
		
		MemberVO vo=login.loginMember();
		if(vo==null) {
			return;
		}
		
		try {
			System.out.println("ȸ���� Ż�� �Ͻðڽ��ϱ�? [Y/N]");
			char ch = br.readLine().charAt(0);
			if(ch!='Y'&&ch !='y') {
				return;
			}
				
			member.deleteMember(vo.getId());
			login.logout();
			
			System.out.println("ȸ��Ż�� �̷�������ϴ�.\n");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public void listAll() {
		System.out.println("\n[ȸ������Ʈ]");
		
		for(MemberVO vo : member.listMember()) {
			System.out.println(vo);
		}
		System.out.println();
	}

	public void findByName() {
		System.out.println("\n[ȸ���˻�]");
		
		try {
			String name;
			System.out.print("�̸� ? ");
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
