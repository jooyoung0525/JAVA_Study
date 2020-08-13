package ex0812_Exception_Generic;

public class Finally_Ex2 {
	public static void main(String[] args) {
		User10 uu = new User10();
		int s;
		try {
			s=uu.sum(-5); // throws  �ؼ� ���� ����
			System.out.println(s);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class User10 {
	public int sum(int n) throws Exception {
		//throws : ȣ���ϴ� ������ ���ܸ� ĳġ�ϴ� ��
		//�ݵ�� ȣ��ο��� ����ó���ؾ���
		int s = 0;
		if(n<0) {
			//���ܸ� ������� �߻���Ŵ checked exception
			throw new Exception("���� 0���� ���� �� �����ϴ�.");
		}
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		return s;
	}
}