package ex0812_Exception_Generic;

public class ThrowsException_Ex5 {
	public static void main(String[] args) {
		User14 obj = new User14();
		try {
			// �ȿ� ������ �����ϸ� try �ȿ����� ��ȿ
			obj.setValue(-5);
			System.out.println(obj.getValue()); // 0�� ���´�.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


class User14 {
	private int value;

	// checked Exception
	public void setValue(int value) throws Exception {
		//���� �ѱ��
		if (value < 0) {
			throw new Exception("0�̻� �����մϴ�");
			//����� ���� �߻�
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}