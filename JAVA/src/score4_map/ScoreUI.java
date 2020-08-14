package score4_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

public class ScoreUI {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //���پ� �Է�
	private Score score = new ScoreImpl();
	
	
	public void menu() {
		
		char ch;
		while(true) {
			try {
			
				do {
					System.out.println("1.�Է�  2.����  3.����  4.�й��˻�  5.�̸��˻�  6.����Ʈ  7.���� =>");
					ch = br.readLine().charAt(0);
				}while(ch<'1'||ch>'7');
				
				if(ch =='7') {
					System.exit(0); //���α׷� ���� ����.
				}
				
				switch(ch) {
				case '1': insert(); break;
				case '2': update();break;
				case '3': delete();break;
				case '4': findByHak();break;
				case '5': findByName();break;
				case '6': list();break;
				}
			} catch (Exception e) {
				
			}
		}
	}
	
	public void insert() {
		System.out.println("\n������ ���...");
		try {
			String hak;
			ScoreVO vo = new ScoreVO();
			
			System.out.print("�й� ? ");
			hak = br.readLine();
			
			System.out.print("�̸� ? ");
			vo.setName(br.readLine());
			
			System.out.println("���� ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.println("���� ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.println("���� ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			boolean b = score.insertScroe(hak, vo);
			if(!b) {
				System.out.println("�й� �ߺ����� �߰��� �����߽��ϴ�.\n");
				return;
			}
			System.out.println("�����͸� �߰��߽��ϴ�.\n");
		} catch (NumberFormatException e) {
			System.out.println("������ ���ڸ� �����մϴ�.\n"); //readLine�� �ݵ�� ����ó���ؾ���.
		}catch (Exception e) {
			e.printStackTrace();
			//���ڿ��� ���ڷ� �ٲܶ� ���ܹ߻� =>Numberformatexception
			//readLine => Ioexception
		}
	}
	
	public void update() {
		System.out.println("\n������ ����...");
		try {
			System.out.print("������ �й� ? ");
			String hak;
			hak = br.readLine();
			ScoreVO vo = score.readScore(hak);		
			if(vo == null) {
				System.out.println("��ϵ� �й��� �ƴմϴ�.\n");
				return;
			}
			
			System.out.print("�̸� ? ");
			vo.setName(br.readLine());
			
			System.out.println("���� ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.println("���� ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.println("���� ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("�����͸� �����߽��ϴ�.\n");
			
		} catch (NumberFormatException e) {
			System.out.println("������ ���ڸ� �����մϴ�.\n"); 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		System.out.println("\n������ ����...");
		
		try {
		
			System.out.print("������ �й� ? ");
			String hak;
			hak = br.readLine();
			
			boolean b = score.deleteScore(hak);
			if(!b) {
				System.out.println("������ ������ �����Ͽ����ϴ�.\n");
				return;
			}
			System.out.println("�����͸� �����߽��ϴ�.\n");
		} catch (NumberFormatException e) {
			System.out.println("������ ���ڸ� �����մϴ�.\n"); //readLine�� �ݵ�� ����ó���ؾ���.
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void findByHak() {
		System.out.println("\n�й� �˻�...");
		
		String hak;
		try {
			System.out.print("�˻��� �й� ? ");
			hak = br.readLine();
			ScoreVO vo = score.readScore(hak);
			
			if(vo == null) {
				System.out.println("��ϵ� �ڷᰡ �ƴմϴ�.");
				return;
			}
			
			System.out.print(hak+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(vo.getTot()+"\t");
			System.out.print(vo.getAvg()+"\t");
			System.out.println();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void findByName() {
		System.out.println("\n�̸� �˻�...");
		
		String name;
		try {
			System.out.print("�˻��� �̸� ? ");
			name = br.readLine();
			
			Map<String,ScoreVO>map = score.listScore();
			Iterator<String>it = map.keySet().iterator();
			while(it.hasNext()) {
				String hak = it.next();
				ScoreVO vo = map.get(hak);
				
				if(vo.getName().startsWith(name)) {
					System.out.print(hak+"\t");
					System.out.print(vo.getName()+"\t");
					System.out.print(vo.getKor()+"\t");
					System.out.print(vo.getEng()+"\t");
					System.out.print(vo.getMat()+"\t");
					System.out.print(vo.getTot()+"\t");
					System.out.print(vo.getAvg()+"\t");
					System.out.println();
				}
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void list() {
		System.out.println("\n����Ʈ...");
		
		Map<String,ScoreVO>map = score.listScore();
		Iterator<String>it = map.keySet().iterator();
		while(it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = map.get(hak);
			
			System.out.print(hak+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(vo.getTot()+"\t");
			System.out.print(vo.getAvg()+"\t");
			System.out.println();
		}
		System.out.println();
		
	}
	
}
