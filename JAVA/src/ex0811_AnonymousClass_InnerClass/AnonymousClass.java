package ex0811_AnonymousClass_InnerClass;

public class AnonymousClass {
	public static void main(String[] args) {
		//Test3 ob = new Test3();// ������ ���� => �������̽��� ��ü �����̾ȵ�
		
		
		//�͸��� Ŭ���� ==> �̸� ���� Ŭ����
		//�������ϸ� Ex3$1 �̸����� �����ϵ�
		Test3 ob = new Test3() {

			@Override
			public int max(int a, int b) { //�������̽����� ������ �߻� �޼ҵ� ���� (�޼ҵ尡 �ΰ��̻��̸� ����)
				return a>b?a:b;
			}	
		};
		int n = ob.max(10, 5);
		System.out.println(n);
	}
}

interface Test3{
	public int max(int a,int b);
}