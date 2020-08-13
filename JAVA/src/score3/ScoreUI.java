package score3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ScoreUI {
	private Scanner sc = new Scanner(System.in);
	private Score score = new ScoreImpl();
	
	public void menu() {
		int ch;
		
		while(true) {
			
			try {
			
				do {
					System.out.println("1.���   2.����   3.����   4.����Ʈ   5.�й��˻�   6.�̸��˻�   7.����  =>");
					ch = sc.nextInt();
				}while(ch<1||ch>7);
				
				if(ch == 7)return;
				
				switch(ch) {
				case 1: insert(); break;
				case 2: update();break;
				case 3: delete();break;
				case 4: list();break;
				case 5: findByHak();break;
				case 6: findByName();break;
				
				}
				
			} catch (InputMismatchException e) {
				sc.nextLine(); //�����ִ� ���� ����
			}
			
		}
	} 
	
	
	public void insert(){
		System.out.println("\n������ �߰�...");
		
		
		try {
			
			ScoreVO vo = new ScoreVO();
			String hak;
			System.out.print("�й� ?");
			hak=sc.next();
			
			if(score.readScore(hak)!=null) {
				System.out.println("��ϵ� �й��Դϴ�.\n");
				return;
			}
			vo.setHak(hak);
			
			System.out.print("�̸� ?");
			vo.setName(sc.next());
			
			System.out.print("���� ?");
			vo.setKor(sc.nextInt());
			
			System.out.print("���� ?");
			vo.setEng(sc.nextInt());
			
			System.out.print("���� ?");
			vo.setMat(sc.nextInt());
			
			score.insertScore(vo);
			System.out.print("��� �Ϸ�....\n");
			
			
			
		}catch (InputMismatchException e) { //���� �߸� �Է������� ����
			sc.nextLine(); 
			System.out.println("������ ���ڸ� �����մϴ�...\n");
		}catch (Exception e) {
			System.out.println("������ �߰� ����...");
		
		}	
	}
	
	public void update() {
		System.out.println("\n������ ����...");
		
		String hak;
		System.out.print("������ �й� ?");
		hak = sc.next();
		
		ScoreVO vo = score.readScore(hak);
		if(vo == null) {
			System.out.println("������ �����Ͱ� �������� �ʽ��ϴ�.\n");
			return;
		}
		//���ο� ��ü�� �����ؼ� ��ü�� �ٽ� �Է¹ް� �������൵ ��.
		try {
			System.out.print("�̸� ?");
			vo.setName(sc.next());
			
			System.out.print("���� ?");
			vo.setKor(sc.nextInt());
			
			System.out.print("���� ?");
			vo.setEng(sc.nextInt());
			
			System.out.print("���� ?");
			vo.setMat(sc.nextInt());
			System.out.print("���� �Ϸ�....\n");
			
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("������ ���ڸ� ����...\n");
		} catch (Exception e) {
			System.out.println("��������...\n");
		}
		
	}
	
	
	
	public void delete() {
		System.out.println("\n������ ����...");
		
		String hak;
		System.out.print("������ �й� ?");
		hak= sc.next();
		
		boolean isdel = score.deleteScore(hak);
		if(isdel == false) {
			System.out.println("��ϵ� �й��� �����ϴ�.\n");
			return;
		}
		
		System.out.println("�ڷᰡ �����Ǿ����ϴ�.\n");
	}
	
	
	
	
	public void list() {
		System.out.println("\n��ü ����Ʈ...");
		
		List<ScoreVO> list = score.listScore();
		for(ScoreVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}
	
	
	
	public void findByHak() {
		System.out.println("\n�й� �˻�...");
		
		String hak;
		System.out.print("�˻��� �й� ?");
		hak = sc.next();
		
		ScoreVO vo = score.readScore(hak);
		
		if(vo == null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}
		
		System.out.println(vo+"\n");
	}
	
	public void findByName() {
		System.out.println("\n�̸� �˻�...");
		
		String name;
		System.out.print("�˻��� �̸� ? ");
		name = sc.next();
		
		List<ScoreVO> list = score.listScore(name);
		
		if(list.size()==0) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.\n");
			return;
		}
		
		for(ScoreVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
		
		
	}
}
