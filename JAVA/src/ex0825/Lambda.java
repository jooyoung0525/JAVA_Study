package ex0825;

public class Lambda {
	public static void main(String[] args) {
		//����Ÿ���� void�̸� �Ķ���Ͱ� ���� ���ٽ�
		User2 obj = ()-> {System.out.println("�ȳ�");}; 
		//User2 obj = ()-> System.out.println("�ȳ�");  ==> ���� ������ ��,{}��������.
		obj.write();
	}
}

interface User2{
	public void write();
}