package score2_array;

import java.util.Scanner;

//UI단

public class Score {
	private Scanner sc = new Scanner(System.in);
	
	private ScoreService ss = new ScoreService();
	
	
	public void menu() {
		int ch;
		
		while(true) {
			do {
				System.out.print("1.등록  2.학번검색  3.리스트  4.수정  5.삭제  6.종료  =>");
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
		System.out.println("\n데이터 등록...");
		
		ScoreVO vo = new ScoreVO();
		
		System.out.println("학번?");
		vo.setHak(sc.next());
		
		System.out.println("이름?");
		vo.setName(sc.next());
		
		System.out.println("국어?");
		vo.setKor(sc.nextInt());
		
		System.out.println("영어?");
		vo.setEng(sc.nextInt());
		
		System.out.println("수학?");
		vo.setMat(sc.nextInt());
		
		
		//배열에 저장
		ss.append(vo);
		System.out.println("데이터를 추가했습니다.\n");
	}
	
	
	
	public void print() {
		System.out.println("\n데이터 출력...");
		
		int count = ss.getCount();
		System.out.println("총 인원수 : "+count);
		
		ScoreVO list[] = ss.listScore();
		for(int i = 0; i<count; i++) { //입력한거만큼만 출력
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
		System.out.println("\n학번 검색...");
		
		String hak;
		System.out.print("검색할 학번?");
		hak = sc.next();
		
		ScoreVO vo = ss.readScore(hak);
		if(vo == null) {
			System.out.println("등록된 학번이 아닙니다.\n");
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
		System.out.println("\n데이터 수정...");
		
		// 학번을 입력 받아서 검색
		// 만약에 null이면  존재하지 않는 데이터라는 메세지 출력
		// 존재하면 이름, 국어, 영어, 수학을 입력 받아 
		// 원래 데이터를 수정한다.
		
		String hak; //hak이름을 가진 String 선언
		System.out.print("수정 할 학번?"); //수정할 학번을 프린트
		hak = sc.next(); //hak변수에 String값 입력
		
		ScoreVO vo = ss.readScore(hak); //학번이 같으면 주소값 리턴, 학번이 다르면 null리턴
		if(vo == null) { 
			System.out.println("존재하지 않는 데이터입니다."); 
			return;
		}
		
		//학번이 같아서 vo의 주소값을 리턴했으니까 해당 위치에 재 입력 받기
		System.out.print("수정할 이름은?");
		vo.setName(sc.next());
		System.out.print("수정할 국어?");
		vo.setKor(sc.nextInt());
		System.out.print("수정할 영어?");
		vo.setEng(sc.nextInt());
		System.out.print("수정할 수학?");
		vo.setMat(sc.nextInt());
	}
	
	
	
	
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
		
		String hak; //hak이름을 가진 String 선언
		System.out.print("삭제 할 학번?"); //수정할 학번을 프린트
		hak = sc.next(); //hak변수에 String값 입력
		
		ScoreVO vo = ss.readScore(hak); //학번이 같으면 주소값 리턴, 학번이 다르면 null리턴
		if(vo == null) { 
			System.out.println("존재하지 않는 데이터입니다."); 
			return;
		}
		
		//삭제
		int count = ss.getCount(); //count값
		ScoreVO list[] = ss.listScore();
		for(int i = 0; i<count; i++) { //입력한거만큼만 출력
			if(list[i]==vo) {
				for(int j = i+1; j<count; j++) {
					list[j-1] = list[j];
				}
				count--;
				ss.setCount(count);
				break;
			}
		}
		
		System.out.println("삭제되었습니다.\n");
	}
	
	
}
