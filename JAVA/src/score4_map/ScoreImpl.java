package score4_map;

import java.util.Map;
import java.util.TreeMap;

public class ScoreImpl implements Score{

	//private Map<String,ScoreVO> map = new HashMap<>();
	private Map<String,ScoreVO> map = new TreeMap<>(); //�й���������
	
	@Override
	public boolean insertScroe(String hak, ScoreVO vo) {
		if(map.containsKey(hak)) {
			return false;
		}
		
		map.put(hak,vo);
		
		return true;
	}

	@Override
	public ScoreVO readScore(String hak) {
		ScoreVO vo = map.get(hak); //get���� ������ null -> return null���ص���
		
		return vo;
	}

	@Override
	public boolean deleteScore(String hak) {
		if(!map.containsKey(hak)) {
			return false;
		}
		map.remove(hak);
		
		return true;
	}

	@Override
	public Map<String, ScoreVO> listScore() {
		
		return map;
	}
}
