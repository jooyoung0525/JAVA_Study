package ex0811;

public class StaticNestedClass {
	public static void main(String[] args) {
	
		//Test5 obj = new Test5(); // ������ ���� -> Test5�� �ܵ�Ŭ������ �ƴϱ� ����
		
		
		//static class�� �ܺο��� �ܵ� ��ü ���� ����
		User5.Test5 obj = new User5.Test5(); 
		obj.write();
		
	}
}


class User5{ //User5�� ��ü�� �������� �ʾƵ� Test5�� ��ü����
	static int a = 10;
	int b = 20;
	
	//static ��ø Ŭ����. ��ø Ŭ���������� static class�� ���� ==> ���ȿ� �� ����
	//�ܺ� Ŭ������ ��ü ������ ������� �ܺο��� ��ü�� ������ �� ����
	//�������ϸ�  USer5$Test5.class �̸����� �����ϵ�
	public static class Test5{
		int c = 30;
		
		public void write() {
			//System.out.println(b);//�Ŀ��� -> User5�� �޸� �Ҵ翡 ������� Ŭ�����̱� ������ ���� �Ұ�
			System.out.println(a+":"+c);
		}
	}
	
	public void print() {
		Test5 obj = new Test5();
		obj.write();
	}
}