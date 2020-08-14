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
					System.out.println("1.ȸ������  2.��������  3.Ż��  4.���̵�˻�  5.����Ʈ  6.����  =>");
					ch = br.readLine().charAt(0);
				}while(ch<'1'||ch>'7');
				
				
				if(ch == '6') {
					System.exit(0); //���α׷� ����
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
		System.out.println("1. ȸ�� ����... \n");
		
		try {
			MemberVO vo = new MemberVO();
			String Id;
			String Birth;
			
			System.out.print("���̵� ? ");
			Id =br.readLine();
			
			System.out.print("�̸� ? ");
			vo.setName(br.readLine());
			
			System.out.print("�н����� ? ");
			vo.setName(br.readLine());
			
			System.out.print("������� ? ");
			Birth =br.readLine();
			if(!dd.isValidDate(Birth)) {
				System.out.println("�߸��� ������� �Դϴ�.\n");
				return;
			}
			vo.setBirth(Birth);
			
			System.out.print("��ȭ��ȣ ? ");
			vo.setName(br.readLine());
			
			boolean b = mem.insertInfo(Id, vo);
			if(!b) {
				System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.\n");
				return;
			}
			
			System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void update() {
		System.out.println("2. ȸ������ ����... \n");
		
	}
	
	public void delete() {
		System.out.println("3. ȸ�� Ż��... \n");
		
		try {
			String Id;
			Id = br.readLine();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void findById() {
		System.out.println("4. ���̵� �˻�... \n");
		
		try {
			String Id;	
			System.out.print("�˻��� ���̵� ? ");
			Id =br.readLine();
			
			MemberVO vo = mem.readMember(Id);
			
			if(vo == null) {
				System.out.println("�ش� ���̵�� �������� �ʽ��ϴ�.\n");
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
		System.out.println("5. ����Ʈ... \n");
		
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
