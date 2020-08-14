package score4_map;

import java.util.Map;
import java.util.TreeMap;

public class ScoreImpl implements Score{

	//private Map<String,ScoreVO> map = new HashMap<>();
	private Map<String,ScoreVO> map = new TreeMap<>(); //학번오름차순
	
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
		ScoreVO vo = map.get(hak); //get값이 없으면 null -> return null안해도됨
		
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
