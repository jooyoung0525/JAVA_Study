package ex0812_Exception_Generic;

public class Exception_Ex2 {
	public static void main(String[] args) {
		int a= 20;
		int b=0;
		int c;
		
		try {
			//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
			c=a/b;
			System.out.println("���: "+c);
		} catch (ArithmeticException e) {
			//ArithmeticException : ������ �Ұ����Ҷ� �߻� . ���� ��� 0���� ������
			//��Ÿ�ӽ� �߻��ϴ� unchecked exception�̶�� ��
			//���ܰ� �߻��� �� ������ �ڵ�
			System.out.println("���� 0���� ������ ����.");
		}
		System.out.println("����...");
	}
}
