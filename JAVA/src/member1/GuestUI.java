package member1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GuestUI {
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	private Member member;
	private Login login;
	
	public GuestUI(Member member, Login login) { //�����ڸ� �̿��� �������� ����.
		this.member = member;
		this.login = login;
	}
	
	public void register() {
		System.out.println("\n[ȸ������]");
		
		String id;
		try {
			System.out.print("���̵� ? ");
			id = br.readLine();
			
			if(member.readMember(id)!=null) {
				System.out.println("��ϵ� ���̵� �Դϴ�.\n");
				return;
			}
			
			MemberVO vo=new MemberVO();
			vo.setId(id);
			
			System.out.print("�н����� ? ");
			vo.setPwd(br.readLine());

			System.out.print("�̸� ? ");
			vo.setName(br.readLine());
			
			System.out.print("������� ? ");
			vo.setBirth(br.readLine());

			System.out.print("��ȭ��ȣ ? ");
			vo.setTel(br.readLine());

			member.insertMember(vo);
			
			System.out.println("ȸ�������� ���� �߽��ϴ� �α��� �Ͻñ� �ٶ��ϴ�.\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void login() {
		System.out.println("\n[�α���]");
		
		String id, pwd;
		
		try {
			System.out.print("���̵� ? ");
			id = br.readLine();

			System.out.print("�н����� ? ");
			pwd = br.readLine();
			
			if(! login.isLogin(id, pwd)) {
				System.out.println("���̵� �Ǵ� �н����尡 ��ġ���� �ʽ��ϴ�.\n");
				return;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
