package ex0804;

public class Constructor_Overloading {
	public static void main(String[] args) {

		Demo3 ob1 = new Demo3();
		ob1.write(); //���ھ��� ������...
		             //10
		
		Demo3 ob2 = new Demo3();
		ob2.write(); //�����ִ� ������...
		             //20
		
	}
}


class Demo3{
	int a;
	
	public Demo3() {
		System.out.println("���ھ��� ������...");
		a = 10;
	}
	
	public Demo3(int x) {
		System.out.println("�����ִ� ������...");
		a=x;
	}
	
	public void write() {
		System.out.println(a);
	} 
}