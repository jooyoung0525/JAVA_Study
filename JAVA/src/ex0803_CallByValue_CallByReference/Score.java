package ex0803_CallByValue_CallByReference;

import java.util.Scanner;

public class Score {
	private Scanner sc = new Scanner(System.in); //여기서는 close안해도 됨. JVM이 알아서 해줌
	
	private int cnt; //필드는 초기화 하지 않으면 0 //필드 -> 전역변수
	
	
	private ScoreVO []list = new ScoreVO[50]; //정보를 저장하는 주소를 저장하는 배열(필드) 
	//private ScoreVO v1,v2,v50; //10번줄과 11번줄 같음
	
	
	public void input() {
		
		if(cnt>=50) {
			System.out.println("데이터를 더이상 입력 할 수 없습니다...");
			return;
		}
		
		System.out.print("\n데이터 입력...");
		
		//<<오류!!!>>
		/*
		//java.lang.NullPointerException 오류 
		String s = sc.next();
		list[cnt].setName(s); //객체에 대한 메모리할당 받지 못함.--> 생성자 필요!
		*/
		
		/*
		//java.lang.NullPointerException 오류
		String s = sc.next(); 
		ScoreVO vo = null; //객체 생성이안됨
		vo.setName(s);
		*/
		
		
		/* 방법 1
		ScoreVO vo = new ScoreVO(); //vo:주소

		System.out.print("이름 ? ");
		vo.setName(sc.next());
		
		System.out.print("국어 ? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		vo.setMat(sc.nextInt());
		
		list[cnt]=vo; //vo객체를 생성해서 list에 담음
		*/
		
		// 방법 2  --> new다음 클래스를 해야 객체가 생성!!!!
		list[cnt] =new ScoreVO(); //아예 처음부터 list에 ScoreVO객체를 담음
		
		System.out.print("이름 ? ");
	    list[cnt].setName(sc.next());
	    
	    System.out.print("국어 ? ");
		list[cnt].setKor(sc.nextInt());
		
		System.out.print("영어 ? ");
		list[cnt].setEng(sc.nextInt());
		
		System.out.print("수학 ? ");
		list[cnt].setMat(sc.nextInt());
		
		cnt++;
	}
	
	
	public void print() {
		System.out.println("\n데이터 출력...");
		System.out.println("전체인원수 :" +cnt);
		
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
		System.out.print("\n데이터 검색...");
	}
	
}
