package ex0804_Constructor_Recursion;

public class Constructor_this2 {
	public static void main(String[] args) {

		
	}
}


class Demo6{
	int a;
	static int b;
	
	public void set(int a) {
		this.a = a;
	}
	
	public static void method(int b) { //�ν��Ͻ� �޼ҵ尡 �ƴϱ� ������ �����Ͽ���
		//this.b = b; ������ ����.
		//this�� static�޼ҵ忡�� ��� �Ұ�

		Demo6.b = b;
	}
	
	
	public void write() {
		System.out.println(a+":"+b);
	} 
}