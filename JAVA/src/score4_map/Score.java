package score4_map;

import java.util.Map;

public interface Score {
	public boolean insertScroe(String hak, ScoreVO vo);
	public ScoreVO readScore(String hak);
	public boolean deleteScore(String hak);
	public Map<String,ScoreVO> listScore();
}
