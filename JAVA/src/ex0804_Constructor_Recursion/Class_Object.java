package ex0804_Constructor_Recursion;

public class Class_Object {
	public static void main(String[] args) {
		
		//User1 ob;
		//ob.a = 10; ob�� �ʱ�ȭ���� ����. ������ ����
		
		//ob = null; // �ʱ�ȭ�� �Ǿ����� �޸��Ҵ��� �ȵ�. ��Ÿ�ӿ���
		
		
		User1 ob1 = new User1(); //��ü ����
		System.out.println(ob1); //��Ű����.Ŭ������@�ؽ��ڵ� --> ex0804.User1@15db9742 
		                         //--> ������ ��ü�� ����ִ��� ����������
		                     
		ob1.a = 10;
		System.out.println(ob1.a);//10
		
		ob1 = new User1();// ���ο� ��ü ���� 
		                  //���� ob1�� ����Ű�� �ִ� ���������� �޸𸮸� ȸ��
		System.out.println(ob1.a); //0
		System.out.println(ob1);   //�����ʹ� �ٸ� �ڵ�! -> ���ο� �ּҰ��� �����.
	}
}



class User1{
	int a;
	int b;
	String c; //ù���ڰ� �빮�ڸ� Ŭ���� �ƴϸ��������̽�
}