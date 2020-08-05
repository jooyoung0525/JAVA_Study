package score2;

//���� ���� ����

public class ScoreService {
	
	private ScoreVO []list; //ũ��� �����ϰ� �׳� �迭����
	private int count;
	
	public ScoreService() { //������
		//list = new ScoreVO[10]; //�����ڿ��� �迭10�� 	
		allocation(10);
	}
	
	private void allocation(int capacity) {
		ScoreVO temp[] = new ScoreVO[capacity]; //temp�� ũ�⸦ ��� �÷��� list�� ����
		if(list!=null && count>0) {
			System.arraycopy(list, 0, temp, 0, count);
		}
		list = temp;
	}
	
	public int append(ScoreVO vo) {
		if(count>=list.length) {
			
			//�迭�� 10���� �ñ�
			allocation(list.length+10);
		}
		
		list[count++] = vo; 
		
		return count;
	}
	
	
	public ScoreVO readScore(String hak) {
		
		ScoreVO vo = null;
		
		//��ü(���ڿ� ����)�� == ���� ���ϸ� �ּҸ� ���Ѵ�.
		//���� ���ڿ��� ���ϱ� ���ؼ��� 
		//String Ŭ������ equals()�� ����ؾ� �Ѵ�.
		
		for(int i = 0; i<count; i++) {
			if(list[i].getHak().equals(hak)) {
				vo = list[i];
				break;
			}
		}
		
		return vo;
	}
	
	public int getCount() { //�ο��� �˼��ִ� �޼ҵ�
		return count;
	}
	
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public ScoreVO []listScore() {
		return list;
	}
	
}
