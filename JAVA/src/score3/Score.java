package score3;

import java.util.List;

public interface Score {
	public void insertScore(ScoreVO vo); //������ �߰�
	public boolean deleteScore(String hak); //������ ����
	public List<ScoreVO> listScore(); //��ü���
	public ScoreVO readScore(String hak);  
	public List<ScoreVO> listScore(String name); //�̸��˻�
}
