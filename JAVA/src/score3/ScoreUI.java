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
					System.out.println("1.등록   2.수정   3.삭제   4.리스트   5.학번검색   6.이름검색   7.종료  =>");
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
				sc.nextLine(); //남아있는 엔터 삭제
			}
			
		}
	} 
	
	
	public void insert(){
		System.out.println("\n데이터 추가...");
		
		
		try {
			
			ScoreVO vo = new ScoreVO();
			String hak;
			System.out.print("학번 ?");
			hak=sc.next();
			
			if(score.readScore(hak)!=null) {
				System.out.println("등록된 학번입니다.\n");
				return;
			}
			vo.setHak(hak);
			
			System.out.print("이름 ?");
			vo.setName(sc.next());
			
			System.out.print("국어 ?");
			vo.setKor(sc.nextInt());
			
			System.out.print("영어 ?");
			vo.setEng(sc.nextInt());
			
			System.out.print("수학 ?");
			vo.setMat(sc.nextInt());
			
			score.insertScore(vo);
			System.out.print("등록 완료....\n");
			
			
			
		}catch (InputMismatchException e) { //숫자 잘못 입력했을때 예외
			sc.nextLine(); 
			System.out.println("점수는 숫자만 가능합니다...\n");
		}catch (Exception e) {
			System.out.println("데이터 추가 실패...");
		
		}	
	}
	
	public void update() {
		System.out.println("\n데이터 수정...");
		
		String hak;
		System.out.print("수정할 학번 ?");
		hak = sc.next();
		
		ScoreVO vo = score.readScore(hak);
		if(vo == null) {
			System.out.println("수정할 데이터가 존재하지 않습니다.\n");
			return;
		}
		//새로운 객체를 생성해서 객체에 다시 입력받고 수정해줘도 됨.
		try {
			System.out.print("이름 ?");
			vo.setName(sc.next());
			
			System.out.print("국어 ?");
			vo.setKor(sc.nextInt());
			
			System.out.print("영어 ?");
			vo.setEng(sc.nextInt());
			
			System.out.print("수학 ?");
			vo.setMat(sc.nextInt());
			System.out.print("수정 완료....\n");
			
		} catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("점수는 숫자만 가능...\n");
		} catch (Exception e) {
			System.out.println("수정실패...\n");
		}
		
	}
	
	
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
		
		String hak;
		System.out.print("삭제할 학번 ?");
		hak= sc.next();
		
		boolean isdel = score.deleteScore(hak);
		if(isdel == false) {
			System.out.println("등록된 학번이 없습니다.\n");
			return;
		}
		
		System.out.println("자료가 삭제되었습니다.\n");
	}
	
	
	
	
	public void list() {
		System.out.println("\n전체 리스트...");
		
		List<ScoreVO> list = score.listScore();
		for(ScoreVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
	}
	
	
	
	public void findByHak() {
		System.out.println("\n학번 검색...");
		
		String hak;
		System.out.print("검색할 학번 ?");
		hak = sc.next();
		
		ScoreVO vo = score.readScore(hak);
		
		if(vo == null) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		
		System.out.println(vo+"\n");
	}
	
	public void findByName() {
		System.out.println("\n이름 검색...");
		
		String name;
		System.out.print("검색할 이름 ? ");
		name = sc.next();
		
		List<ScoreVO> list = score.listScore(name);
		
		if(list.size()==0) {
			System.out.println("등록된 자료가 없습니다.\n");
			return;
		}
		
		for(ScoreVO vo : list) {
			System.out.println(vo);
		}
		System.out.println();
		
		
	}
}
