package score3;

import java.util.List;

public interface Score {
	public void insertScore(ScoreVO vo); //데이터 추가
	public boolean deleteScore(String hak); //데이터 삭제
	public List<ScoreVO> listScore(); //전체출력
	public ScoreVO readScore(String hak);  
	public List<ScoreVO> listScore(String name); //이름검색
}
