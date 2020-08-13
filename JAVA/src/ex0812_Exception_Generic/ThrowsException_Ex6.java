package ex0812_Exception_Generic;

public class ThrowsException_Ex6 {
	public static void main(String[] args) {
		User16 obj = new User16();
		
		try {
			obj.set(-5);
			int n = obj.getValue();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("main : "+e.getMessage());
		}
	}
}
class User16 {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) throws Exception {
		//���ܸ� �ǳ��ش�.
		if(value < 0) {
			throw new Exception("0�̻� �����մϴ�.");
		}
		this.value = value;
	}
	public void set(int value) throws Exception {
		// ���ܸ� �ǳ��ش�.
		//���ܸ� �ǳ����� ������ main���� ���ܰ� �߻����� �ʴ´�.
		try {
			setValue(value);
		} catch (Exception e) {
			throw e; // ���ܸ� �ٽ� ������.
//			System.out.println(e.getMessage());
		}
	}
}