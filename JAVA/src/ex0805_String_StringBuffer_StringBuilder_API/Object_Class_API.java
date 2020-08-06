package ex0805_String_StringBuffer_StringBuilder_API;

public class Object_Class_API {
	public static void main(String[] args) {
		User1 u1 = new User1();
		User1 u2 = new User1();

		if (u1 == u2) { // == : ��ü������ �ּҸ� ��
			System.out.println("������ ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}

		// Object Ŭ������ equals() : ��ü�� �ּ� ��
		if (u1.equals(u2)) {
			System.out.println("������ ��ü");
		} else {
			System.out.println("�ٸ� ��ü");
		}
		
		//Object Ŭ������ toString() : ��Ű����. Ŭ������@�ؽ��ڵ�
		System.out.println(u1.toString()); 
		System.out.println(u2.toString());
		System.out.println(u1); //toString() ��������
		System.out.println(u2);
		
		//Object Ŭ������ hashCode() : �ؽ��ڵ尪 ��ȯ
		// �ؽ��ڵ�� ? : JVM�� ��ü�� ������ �˻��ϱ� ���� ���
		// �ؽ��ڵ尡 �ٸ��� �ٸ���ü������, �ؽ��ڵ尡 ���ٰ� ������ü�� �ƴϴ�.
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}


class User1{ //equals �������� ������ main���� ����� �� ������ ObjectŬ����
	int a;
}