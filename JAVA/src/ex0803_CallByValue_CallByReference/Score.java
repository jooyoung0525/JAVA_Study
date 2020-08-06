package ex0803_CallByValue_CallByReference;

import java.util.Scanner;

public class Score {
	private Scanner sc = new Scanner(System.in); //���⼭�� close���ص� ��. JVM�� �˾Ƽ� ����
	
	private int cnt; //�ʵ�� �ʱ�ȭ ���� ������ 0 //�ʵ� -> ��������
	
	
	private ScoreVO []list = new ScoreVO[50]; //������ �����ϴ� �ּҸ� �����ϴ� �迭(�ʵ�) 
	//private ScoreVO v1,v2,v50; //10���ٰ� 11���� ����
	
	
	public void input() {
		
		if(cnt>=50) {
			System.out.println("�����͸� ���̻� �Է� �� �� �����ϴ�...");
			return;
		}
		
		System.out.print("\n������ �Է�...");
		
		//<<����!!!>>
		/*
		//java.lang.NullPointerException ���� 
		String s = sc.next();
		list[cnt].setName(s); //��ü�� ���� �޸��Ҵ� ���� ����.--> ������ �ʿ�!
		*/
		
		/*
		//java.lang.NullPointerException ����
		String s = sc.next(); 
		ScoreVO vo = null; //��ü �����̾ȵ�
		vo.setName(s);
		*/
		
		
		/* ��� 1
		ScoreVO vo = new ScoreVO(); //vo:�ּ�

		System.out.print("�̸� ? ");
		vo.setName(sc.next());
		
		System.out.print("���� ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("���� ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("���� ? ");
		vo.setMat(sc.nextInt());
		
		list[cnt]=vo; //vo��ü�� �����ؼ� list�� ����
		*/
		
		// ��� 2  --> new���� Ŭ������ �ؾ� ��ü�� ����!!!!
		list[cnt] =new ScoreVO(); //�ƿ� ó������ list�� ScoreVO��ü�� ����
		
		System.out.print("�̸� ? ");
	    list[cnt].setName(sc.next());
	    
	    System.out.print("���� ? ");
		list[cnt].setKor(sc.nextInt());
		
		System.out.print("���� ? ");
		list[cnt].setEng(sc.nextInt());
		
		System.out.print("���� ? ");
		list[cnt].setMat(sc.nextInt());
		
		cnt++;
	}
	
	
	public void print() {
		System.out.println("\n������ ���...");
		System.out.println("��ü�ο��� :" +cnt);
		
		for(int i = 0; i<cnt; i++)
		{
			System.out.print(list[i].getName()+"\t");
			System.out.print(list[i].getKor()+"\t");
			System.out.print(list[i].getEng()+"\t");
			System.out.print(list[i].getMat()+"\t");
			System.out.print(list[i].getTot()+"\t");
			System.out.print(list[i].getAvg()+"\n");
		}
	}
	
	public void search() {
		System.out.print("\n������ �˻�...");
	}
	
}
