package Interitance_Abstract_Interface;

public class Interface_Ex4 {
	public static void main(String[] args) {
	
		
		IEx3 obj = new Demo3();
		
		int s = IEx3.sum(10); //static �޼ҵ� : ��ü�� ��� �������̽������� ȣ�Ⱑ��
		
		obj.write(s) ;
		
		s= obj.max(10, 5);
		obj.write(s);
	}
}


interface IEx3{
	public void write(int n);
	
	//static �޼ҵ� : JDK 1.8���� ����
	public static int sum(int n) {
		int s = 0;
		for(int i = 1; i<=n; i++) s+=i;
		return s;
	}
	
	//default �޼ҵ� : JDK 1.8���� ����
	// �������̽��� ���������, ���ǰ� �� �޼ҵ�
	// ������ Ŭ�������� ������ ����!!!(override)
	public default int max(int m,int n) { 
		return m>n?m:n;
	}
}

class Demo3 implements IEx3{

	@Override
	public void write(int n) {
	System.out.println("��� : "+n);
	}
	
}