package score3;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score{

	private List<ScoreVO> list = new ArrayList<>(); //객체생성
	
	@Override
	public void insertScore(ScoreVO vo) {
		list.add(vo);
	}

	@Override
	public boolean deleteScore(String hak) {
		ScoreVO vo = readScore(hak);
		
		if(vo==null)
			return false;
		
		list.remove(vo);
		return true;
	}

	@Override
	public List<ScoreVO> listScore() { //private여서 외부접근 불가능해서 그냥 list돌려주기 위해 추가됨
		return list;
	}

	@Override
	public ScoreVO readScore(String hak) {
		for(ScoreVO vo : list) {
			if(vo.getHak().equals(hak))
				return vo;
		}
		return null; //같은 학번 없으면 null 리턴
	}

	@Override
	public List<ScoreVO> listScore(String name) { //이름검색
		List<ScoreVO> list2 = new ArrayList<>();
		
		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) { //성씨로도 검색 가능
				list2.add(vo);
			}
		}
		return list2;
	}

}
