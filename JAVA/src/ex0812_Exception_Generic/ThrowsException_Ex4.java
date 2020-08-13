package ex0812_Exception_Generic;

public class ThrowsException_Ex4 {
	public static void main(String[] args) {
		User15 obj = new User15();

		/*
		 * obj.setValue(-5); 
		 * System.out.println(obj.getValue()); 
		 * ��Ÿ�� ���� �߻�
		 */
		
		// unchecked ����ó�� 
		try {
			 obj.setValue(-5); 
			 System.out.println(obj.getValue()); 
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end...");
	}
}

class User15 {
	private int value;

	// unchecked Exception
	public void setValue(int value) {
		if (value < 0) {
			throw new RuntimeException("0�̻� �����մϴ�");
			// ����� ����(��Ÿ��) �߻�
			// unchecked�� throws �� �ʿ� x
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}