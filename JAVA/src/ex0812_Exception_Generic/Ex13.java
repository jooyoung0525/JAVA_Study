package ex0812_Exception_Generic;

public class Ex13 {
	public static void main(String[] args) {
		
	}
}
//����� ���� ���� Ŭ���� �����(checked exception)
class MyException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ��Ʈ��ũ ���۽� ��ü�� �����ϱ� ���� �����
	
	public MyException(String message) {
		super(message);
	}
}

class User18{
	public int sum(int n) throws MyException {
		int s = 0;
		
		if(n<0) {
			throw new MyException("0�̻��̸� ����");
		}
		for(int i =1;i<=s;i++) {
			s+=i;
		}
		return s;
	}
}