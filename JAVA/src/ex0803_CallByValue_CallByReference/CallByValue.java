package ex0803_CallByValue_CallByReference;

public class CallByValue {
	public static void main(String[] args) {
		User4 u = new User4();
		int x = 5;
		// �Ű����� ���� �⺻�ڷ��� : call by value
		// �ǸŰ������� ���� �Ű������� ������ ���� Ȯ��
		u.sub(x); //x:�ǸŰ�����
		System.out.println(x); //5
	}
}


class User4{
	public void sub(int a) { //a: ���� �Ű�����
		a+=10;
		System.out.println("sub:"+a); //15
	}
}