package score2_array;

import java.util.Scanner;

//UI��

public class Score {
	private Scanner sc = new Scanner(System.in);
	
	private ScoreService ss = new ScoreService();
	
	
	public void menu() {
		int ch;
		
		while(true) {
			do {
				System.out.print("1.���  2.�й��˻�  3.����Ʈ  4.����  5.����  6.����  =>");
				ch = sc.nextInt();
			}while(ch<1||ch>6);
			
			if(ch == 6) {
				return;
			}
			
			switch(ch) {
			case 1:input();break;
			case 2:findByHak();break; 
			case 3:print();break;
			case 4:update();break;
			case 5:delete();break;
			}
		}	
	}
	
	
	
	public void input() {
		System.out.println("\n������ ���...");
		
		ScoreVO vo = new ScoreVO();
		
		System.out.println("�й�?");
		vo.setHak(sc.next());
		
		System.out.println("�̸�?");
		vo.setName(sc.next());
		
		System.out.println("����?");
		vo.setKor(sc.nextInt());
		
		System.out.println("����?");
		vo.setEng(sc.nextInt());
		
		System.out.println("����?");
		vo.setMat(sc.nextInt());
		
		
		//�迭�� ����
		ss.append(vo);
		System.out.println("�����͸� �߰��߽��ϴ�.\n");
	}
	
	
	
	public void print() {
		System.out.println("\n������ ���...");
		
		int count = ss.getCount();
		System.out.println("�� �ο��� : "+count);
		
		ScoreVO list[] = ss.listScore();
		for(int i = 0; i<count; i++) { //�Է��ѰŸ�ŭ�� ���
			ScoreVO vo = list[i];
			System.out.print(vo.getHak()+"\t");
			System.out.print(vo.getName()+"\t");
			System.out.print(vo.getKor()+"\t");
			System.out.print(vo.getEng()+"\t");
			System.out.print(vo.getMat()+"\t");
			System.out.print(vo.getTot()+"\t");
			System.out.print(vo.getAvg()+"\n");
		}
	}
	
	
	
	public void findByHak() {
		System.out.println("\n�й� �˻�...");
		
		String hak;
		System.out.print("�˻��� �й�?");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		if(vo == null) {
			System.out.println("��ϵ� �й��� �ƴմϴ�.\n");
			return;
		}
		
		System.out.print(vo.getHak()+"\t");
		System.out.print(vo.getName()+"\t");
		System.out.print(vo.getKor()+"\t");
		System.out.print(vo.getEng()+"\t");
		System.out.print(vo.getMat()+"\t");
		System.out.print(vo.getTot()+"\t");
		System.out.print(vo.getAvg()+"\n");
		System.out.println();
	}
	
	
	
	public void update() {
		System.out.println("\n������ ����...");
		
		// �й��� �Է� �޾Ƽ� �˻�
		// ���࿡ null�̸�  �������� �ʴ� �����Ͷ�� �޼��� ���
		// �����ϸ� �̸�, ����, ����, ������ �Է� �޾� 
		// ���� �����͸� �����Ѵ�.
		
		String hak; //hak�̸��� ���� String ����
		System.out.print("���� �� �й�?"); //������ �й��� ����Ʈ
		hak = sc.next(); //hak������ String�� �Է�
		
		ScoreVO vo = ss.readScore(hak); //�й��� ������ �ּҰ� ����, �й��� �ٸ��� null����
		if(vo == null) { 
			System.out.println("�������� �ʴ� �������Դϴ�."); 
			return;
		}
		
		//�й��� ���Ƽ� vo�� �ּҰ��� ���������ϱ� �ش� ��ġ�� �� �Է� �ޱ�
		System.out.print("������ �̸���?");
		vo.setName(sc.next());
		System.out.print("������ ����?");
		vo.setKor(sc.nextInt());
		System.out.print("������ ����?");
		vo.setEng(sc.nextInt());
		System.out.print("������ ����?");
		vo.setMat(sc.nextInt());
	}
	
	
	
	
	
	public void delete() {
		System.out.println("\n������ ����...");
		
		String hak; //hak�̸��� ���� String ����
		System.out.print("���� �� �й�?"); //������ �й��� ����Ʈ
		hak = sc.next(); //hak������ String�� �Է�
		
		ScoreVO vo = ss.readScore(hak); //�й��� ������ �ּҰ� ����, �й��� �ٸ��� null����
		if(vo == null) { 
			System.out.println("�������� �ʴ� �������Դϴ�."); 
			return;
		}
		
		//����
		int count = ss.getCount(); //count��
		ScoreVO list[] = ss.listScore();
		for(int i = 0; i<count; i++) { //�Է��ѰŸ�ŭ�� ���
			if(list[i]==vo) {
				for(int j = i+1; j<count; j++) {
					list[j-1] = list[j];
				}
				count--;
				ss.setCount(count);
				break;
			}
		}
		
		System.out.println("�����Ǿ����ϴ�.\n");
	}
	
	
}
