package ex0803_CallByValue_CallByReference;

public class Object_CallByReference {
	public static void main(String[] args) {

		User5 u = new User5(); //���������� -> �ּҸ� ����!
		System.out.println(u.a); //10
			
		// call by reference : ���������� �Ű������� ����
		// �ǸŰ������� ���ĸŰ������� ���� �������� ����
		
		
		u.sub(u); //��ü�� �Ű������� ���� -> �ּҰ��� ����
		System.out.println(u.a); //60
	}
}


class User5{
	
	int a = 10; //�ʵ� (���������ƴ�)
	
	public void sub(User5 ob) {//�� ���� �޼ҵ� �ñ״�ó�� �� //main���� �ּҰ��� ���޹���
		ob.a +=50;
		System.out.println("sub ob.a: "+ ob.a);
	}
}