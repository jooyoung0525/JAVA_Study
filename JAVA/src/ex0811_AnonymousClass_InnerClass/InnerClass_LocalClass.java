package ex0811_AnonymousClass_InnerClass;

public class InnerClass_LocalClass {
	public static void main(String[] args) {
	
	}
}

class User7{
	int a = 10;
	
	public void write() { //���� Ŭ����
		                  //�޼ҵ� �ȿ��� Ŭ���� ������ ����������
		                  // �̷��� ���α׷� ¥�� �ȵ�!!!!
		int b = 20;
		final int c = 30;
		
		class Test7{
			void print() {
				System.out.println(a+":"+c);
				System.out.println(b); //8.0���� ����
			}
		}
		
		//b = 200; //���� Ŭ�������� error.
		           // ���� Ŭ�������� ����ϸ� final ������ ����.
		 
		Test7 obj = new Test7();
		obj.print();
	}
}