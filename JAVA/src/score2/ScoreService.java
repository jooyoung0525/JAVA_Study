package score2;

//실제 동작 구현

public class ScoreService {
	
	private ScoreVO []list; //크기는 안정하고 그냥 배열선언
	private int count;
	
	public ScoreService() { //생성자
		//list = new ScoreVO[10]; //생성자에서 배열10개 	
		allocation(10);
	}
	
	private void allocation(int capacity) {
		ScoreVO temp[] = new ScoreVO[capacity]; //temp의 크기를 계속 늘려서 list에 복사
		if(list!=null && count>0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		list = temp;
	}
	
	public int append(ScoreVO vo) {
		if(count>=list.length) {
			
			//배열을 10개씩 늘기
			allocation(list.length+10);
		}
		
		list[count++] = vo; 
		
		return count;
	}
	
	
	public ScoreVO readScore(String hak) {
		
		ScoreVO vo = null;
		
		//객체(문자열 포함)을 == 으로 비교하면 주소를 비교한다.
		//따라서 문자열을 비교하기 위해서는 
		//String 클래스의 equals()를 사용해야 한다.
		
		for(int i = 0; i<count; i++) {
			if(list[i].getHak().equals(hak)) {
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}
	
	public int getCount() { //인원수 알수있는 메소드
		return count;
	}
	
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public ScoreVO []listScore() {
		return list;
	}
	
}
