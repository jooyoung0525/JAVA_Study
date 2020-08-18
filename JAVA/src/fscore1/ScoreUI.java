package fscore1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class ScoreUI {
	private Score score=new ScoreImpl();
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void menu() {
		int ch;
		
		while(true) {
			try {
				do {
					System.out.println("1.�߰� 2.���� 3.���� 4.����Ʈ 5.�й��˻� 6.���� => ");
					ch=Integer.parseInt(br.readLine());
				} while(ch<1||ch>6);
				
				if(ch==6) {
					score.saveFile(); //����� ���ÿ� ���� ����.
					return;
				}
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update(); break;
				case 3: delete(); break;
				case 4: list(); break;
				case 5: findByHak(); break;
				}
				
			} catch (Exception e) {
				
			}
		}
	}
	
	public void insert() {
		System.out.println("\n������ �߰�...");
		
		try {
			String hak;
			System.out.print("�й� ? ");
			hak = br.readLine();
			
			if(score.readScore(hak)!= null) {
				System.out.println("��ϵ� �й��Դϴ�.\n");
				return;
			}
			
			ScoreVO vo = new ScoreVO();
			vo.setHak(hak);
			
			System.out.print("�̸� ? ");
			vo.setName(br.readLine());
			
			System.out.print("���� ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.print("���� ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.print("���� ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			score.insertScore(vo);
			System.out.println("������ ��� �Ϸ�...\n");
		} catch (Exception e) {
			System.out.println("������ �߰� ����...\n");
		}
		
	}
	
	public void update() {
		System.out.println("\n������ ����...");
		
		try {
			String hak;
			System.out.print("�й� ? ");
			hak = br.readLine();
			
			ScoreVO vo = score.readScore(hak); //�ּҶ� �׳� �ҷ��� �����ϸ��.
			if(vo== null) {
				System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
				return;
			}
		
			System.out.print("�̸� ? ");
			vo.setName(br.readLine());
			
			System.out.print("���� ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.print("���� ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.print("���� ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("������ ���� �Ϸ�...\n");
		} catch (Exception e) {
			System.out.println("������ ���� ����...\n");
		}
	}
	
	public void delete() {
		System.out.println("\n������ ����...");
		
		String hak;
		
		try {
		
			System.out.println("������ �й� ? ");
			hak = br.readLine();
			boolean b = score.deleteScore(hak);
			if(!b) {
				System.out.println("�ڷᰡ ���� �Ǿ����ϴ�. \n");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void list() {
		System.out.println("\n��ü ����Ʈ...");
		List<ScoreVO> list = score.listScore();
		
		for(ScoreVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public void findByHak() {
		System.out.println("\n�й� �˻�...");
		String hak;
		
		try {
			System.out.println("�˻��� �й� ? ");
			hak = br.readLine();
			ScoreVO vo = score.readScore(hak);
			if(vo == null) {
				System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.");
				return;
			}
			System.out.println(vo+"\n");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
