package ex0804_Constructor_Recursion;

public class Constructor_instance_class {
	public static void main(String[] args) {
		Demo5 ob = new Demo5();
		ob.sub1(); 
		ob.write(); //0:0
		
		ob.sub2(); 
		ob.write(); //1:10
	}
}


class Demo5{
	
	int a; //�ν��Ͻ� ���� 
	static int b; //Ŭ���� ����
	
	
	
	public void sub1() {
		int a;
		int b;
		
		a = 10;
		b = 20;
		System.out.println("sub1: "+ a+","+b); //sub1: 10,20
	}
	
	
	
	
	public void sub2() {
		int a;
		int b;
		
		a = 1;
		b = 2;
		System.out.println("sub2: "+a+","+b);
		
		
		
		this.a = 1; //�ν��Ͻ� ����
		
		//this.b = 10; //��� :b�� Ŭ���� �����̱� ������ this�� �� �� ����
		               // �Ϲ������� Ŭ���� ������ this��� Ŭ���������� ����
		
		Demo5.b = 10; //Ŭ���� ����
	}
	
	
	
	public void write() {
		System.out.println(a+":"+b); //���⼭�� this.a, Demo5.b ���� �����ؼ� ������ ��
	}
}