package ex0811_AnonymousClass_InnerClass;

public class InnerClass_MemberClass {
	public static void main(String[] args) {
		
		//������ ����. ���� �ܺΰ�ü�� �����ؾ���
		//User6.Test6 obj = new User6.Test6();
		
		User6 uu = new User6(); //1.�ܺ�Ŭ���� ��ü ������
		User6.Test6 obj = uu.new Test6(); //2.������ Ŭ������ ����
		obj.write(); //������ ������ �̷��� ����� �������� ������ �ʴ´� ! 
		             //�ܺ�Ŭ���� �ȿ��� ����Ŭ���� ����ϱ� ���� ���.
		
	}
}


class User6{ 
	static int a = 10;
	int b = 20;
	
	//���� Ŭ����(member class)
	//�ٸ� Ŭ�������� ��ü�� ������ �� �ܺ� Ŭ������ ��ü�� �������� �ʰ��
	//��ü������ �Ұ����� Ŭ���� 
	//��ø�� ������ static����!
	public class Test6{
		int c=30;
		public void write() {
			System.out.println(a+":"+b+":"+c);
		}
	}
	
	public void sub() {
		Test6 obj = new Test6();
		obj.write();
	}
}