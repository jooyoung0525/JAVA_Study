package score4_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;

public class ScoreUI {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //한줄씩 입력
	private Score score = new ScoreImpl();
	
	
	public void menu() {
		
		char ch;
		while(true) {
			try {
			
				do {
					System.out.println("1.입력  2.수정  3.삭제  4.학번검색  5.이름검색  6.리스트  7.종료 =>");
					ch = br.readLine().charAt(0);
				}while(ch<'1'||ch>'7');
				
				if(ch =='7') {
					System.exit(0); //프로그램 완전 종료.
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
		System.out.println("\n데이터 등록...");
		try {
			String hak;
			ScoreVO vo = new ScoreVO();
			
			System.out.print("학번 ? ");
			hak = br.readLine();
			
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.println("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.println("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.println("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			boolean b = score.insertScroe(hak, vo);
			if(!b) {
				System.out.println("학번 중복으로 추가가 실패했습니다.\n");
				return;
			}
			System.out.println("데이터를 추가했습니다.\n");
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.\n"); //readLine은 반드시 예외처리해야함.
		}catch (Exception e) {
			e.printStackTrace();
			//문자열을 숫자로 바꿀때 예외발생 =>Numberformatexception
			//readLine => Ioexception
		}
	}
	
	public void update() {
		System.out.println("\n데이터 수정...");
		try {
			System.out.print("수정할 학번 ? ");
			String hak;
			hak = br.readLine();
			ScoreVO vo = score.readScore(hak);		
			if(vo == null) {
				System.out.println("등록된 학번이 아닙니다.\n");
				return;
			}
			
			System.out.print("이름 ? ");
			vo.setName(br.readLine());
			
			System.out.println("국어 ? ");
			vo.setKor(Integer.parseInt(br.readLine()));
			
			System.out.println("영어 ? ");
			vo.setEng(Integer.parseInt(br.readLine()));
			
			System.out.println("수학 ? ");
			vo.setMat(Integer.parseInt(br.readLine()));
			
			System.out.println("데이터를 수정했습니다.\n");
			
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.\n"); 
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		System.out.println("\n데이터 삭제...");
		
		try {
		
			System.out.print("삭제할 학번 ? ");
			String hak;
			hak = br.readLine();
			
			boolean b = score.deleteScore(hak);
			if(!b) {
				System.out.println("데이터 삭제에 실패하였습니다.\n");
				return;
			}
			System.out.println("데이터를 삭제했습니다.\n");
		} catch (NumberFormatException e) {
			System.out.println("점수는 숫자만 가능합니다.\n"); //readLine은 반드시 예외처리해야함.
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void findByHak() {
		System.out.println("\n학번 검색...");
		
		String hak;
		try {
			System.out.print("검색할 학번 ? ");
			hak = br.readLine();
			ScoreVO vo = score.readScore(hak);
			
			if(vo == null) {
				System.out.println("등록된 자료가 아닙니다.");
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
		System.out.println("\n이름 검색...");
		
		String name;
		try {
			System.out.print("검색할 이름 ? ");
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
		System.out.println("\n리스트...");
		
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
