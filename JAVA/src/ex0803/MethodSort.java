package ex0803;

public class MethodSort {
	
	//�ν��Ͻ������� ��ü�� �����ؾ� ���
	int a = 10, b = 20; //�ʵ�. �ν��Ͻ� ����
	//Ŭ���������� ��ü�� ������ ������� ���
	static int x = 100; //�ʵ�. Ŭ���� ����
	
	public void sub1() { //�ν��Ͻ��޼ҵ�
		sub2(); //sub1�� �ν��Ͻ��̱� ������ sub2�� �׳� �θ� �� ����
		System.out.println(a+":"+b);
		System.out.println(x); //��ü�� �����ϴ� �������� �ʴ� ��� ���� Ŭ���� ����̱� ������ 
	}
	
	//�ν��Ͻ��޼ҵ�� ��ü�� �����ؾ� ȣ�� �Ҽ� �ִ� �޼ҵ�
	public void sub2() { //�ν��Ͻ��޼ҵ�
		System.out.println("sub2...");
		
	}
	
	//Ŭ�����޼ҵ�� ��ü ������ ��� ���� ȣ��
	public static void sub3() { //Ŭ�����޼ҵ�
		
		//System.out.println(a); //�����Ͽ���
		//sub1(); //�����Ͽ��� 
		System.out.println(x);
		
		MethodSort ob = new MethodSort();
		ob.sub1(); //�ν��Ͻ� �޼ҵ��̱� ������ ��ü�����ؾ���
	}
	
	public static void main(String[] args) { //Ŭ�����޼ҵ�
	
		// sub1(); //������ ���� -> main�� Ŭ���� �޼ҵ��̱� ������ ��ü �����������
		//System.out.println(a); //�����Ͽ���
		
		System.out.println(x);
		
		sub3();
	}
}

class User3 {
	public void method1() {
		
		//System.out.println(x); //���� �ٸ� Ŭ�������� �θ��� ������ Ex3.x�� �����
		System.out.println(MethodSort.x);
		
		
		//System.out.println(MethodSort.a); //���� �ٸ� Ŭ�������� �θ��� ������ Ex3.x�� �����
		//System.out.println(MethodSort.a); //�����Ͽ��� -> ��ü�����ؾ���
		
		MethodSort e = new MethodSort();
		System.out.println(e.a);
	}
	
	
	public static void method2() {
		
		MethodSort.sub3(); //Ŭ���� �޼ҵ� --> ���� Ŭ���� �ȿ����� �׳� sub3()���θ� ȣ�� ���� 
		                   //              �ٸ� Ŭ�������� Ŭ�����޼ҵ� ȣ���ϰ� ���� ��, Ŭ�����̸�.sub3()���� ȣ��
		
	}
}

