package ex0804;

public class Class_ObjectArray {
	public static void main(String[] args) {
		User2 ob;
		
		//��ü �迭
		User2 []list = new User2[3]; // 1. User2 ��ü ������ �� �ִ� ������ 3�� Ȯ��
		   //User2 u1,u2,u3; �� ����
		
		//list[0].a= 10; ��Ÿ�ӿ���. ��ü������ ���� �ʾƼ�
		

		// ��� 1
		ob = new User2(); // ��ü ����
		ob.a = 10;
		list[0]=ob; //ob: �ּ�, list : �ּ�
		
		ob = new User2(); // ��ü ����
		ob.a = 100;
		list[1]=ob;
		
		System.out.println(list[0].a); //10
		System.out.println(list[1].a); //100
		
		
		// ��� 2
		list[2]=new User2(); //������ ����. �ٷ� �޸��Ҵ�
		list[2].a = 50;
		System.out.println(list[2].a); //50
	}
}



class User2{
	int a,b;
	String c;
}