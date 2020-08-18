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
					System.out.println("1.추가 2.수정 3.삭제 4.리스트 5.학번검색 6.종료 => ");
					ch=Integer.parseInt(br.readLine());
				} while(ch<1||ch>6);
				
				if(ch==6) {
					score.saveFile(); //종료와 동시에 파일 저장.
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
		System.out.println("\n데이터 추가...");
		
		try {
			String hak;
			System.out.print("학번 ? ");
			hak = br.readLine();
			
			if(score.readScore(hak)!= null) {
				System.out.println("등록된 학번입니다.\n");
				return;
			}
			
			ScoreVO vo = new ScoreVO();
			vo.setHak(hak);
			
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			score.insertScore(vo);
			System.out.println("데이터 등록 완료...\n");
		} catch (Exception e) {
			System.out.println("데이터 추가 실패...\n");
		}
		
	}
	
	public void update() {
		System.out.println("\n데이터 수정...");
		
		try {
			String hak;
			System.out.print("학번 ? ");
			hak = br.readLine();
			
			ScoreVO vo = score.readScore(hak); //주소라서 그냥 불러서 수정하면됨.
			if(vo== null) {
				System.out.println("등록된 자료가 없습니다.\n");
				return;
			}
		
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.print("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.print("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.print("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("데이터 수정 완료...\n");
		} catch (Exception e) {
			System.out.println("데이터 수정 실패...\n");
		}
	}
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
		
		String hak;
		
		try {
		
			System.out.println("삭제할 학번 ? ");
			hak = br.readLine();
			boolean b = score.deleteScore(hak);
			if(!b) {
				System.out.println("자료가 삭제 되었습니다. \n");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void list() {
		System.out.println("\n전체 리스트...");
		List<ScoreVO> list = score.listScore();
		
		for(ScoreVO vo : list) {
			System.out.println(vo);
		}
	}
	
	public void findByHak() {
		System.out.println("\n학번 검색...");
		String hak;
		
		try {
			System.out.println("검색할 학번 ? ");
			hak = br.readLine();
			ScoreVO vo = score.readScore(hak);
			if(vo == null) {
				System.out.println("등록된 자료가 아닙니다.");
				return;
			}
			System.out.println(vo+"\n");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
