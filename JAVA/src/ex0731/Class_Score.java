package ex0731;

/* 1. �߻�ȭ
 * 
 *  - ����ó��  CLASS
 * 
 *  - �Ӽ� (��� ���� or �ʵ�)
 *    �̸�, ����, ����
 *   
 *  - ���(�޼ҵ�) 
 *    1. ������ ����Ѵ�.
 *    2. ����� ����Ѵ�
 *    
 * 2. Ŭ���� �����
 * 3. ��ü����
 * */

public class Class_Score {
	
	//�Ӽ�(�ʵ�, �ν��Ͻ� ����)
	String name;
	int Kor, Eng;

	//���(�ν��Ͻ��޼ҵ�)
	public int tot() {
		return Kor+Eng;
	}
	
	public int ave() {
		return tot()/2;
	}
}

//public class�� �ϳ�������!!!!!!
//class {}�� �� ���Ͽ� ��� ������ �� ������ �̷��� �����ϸ� ��������!!