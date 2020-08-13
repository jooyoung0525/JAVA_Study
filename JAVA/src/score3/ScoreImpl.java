package score3;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score{

	private List<ScoreVO> list = new ArrayList<>(); //��ü����
	
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
	public List<ScoreVO> listScore() { //private���� �ܺ����� �Ұ����ؼ� �׳� list�����ֱ� ���� �߰���
		return list;
	}

	@Override
	public ScoreVO readScore(String hak) {
		for(ScoreVO vo : list) {
			if(vo.getHak().equals(hak))
				return vo;
		}
		return null; //���� �й� ������ null ����
	}

	@Override
	public List<ScoreVO> listScore(String name) { //�̸��˻�
		List<ScoreVO> list2 = new ArrayList<>();
		
		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) { //�����ε� �˻� ����
				list2.add(vo);
			}
		}
		return list2;
	}

}
