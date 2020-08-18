package Interitance_Abstract_Interface;

public class Inheritance_Constructor_Ex1 {
	public static void main(String[] args) {
		User1 uu = new User1();
		uu.print();
	}
}



class Test1 { // default =>���� ��Ű�� �ȿ��� ���ٰ��� //Test1�� �ƹ����� Object
	private int a;
	int b;

	{
		System.out.println("super �ʱ�ȭ ��");
	}

	public Test1() {

		System.out.println("super ������...");
		a = 10;
		b = 20;
	}

	public void print() {
		System.out.println(a + ": " + b);
	}
}



class User1 extends Test1 { //��ӹ����� �ƹ����� �޸��Ҵ� ���� ������ �ڽ��� ���� ���Ұ�
	int b;
	int c;

	{
		System.out.println("sub �ʱ�ȭ ��");
	}

	public User1() {
		super(); //�ֻ�ܿ� �� �ѹ���! �����ϸ� �����Ϸ��� �߰� ==> �ƹ����� �����ڸ� �θ�
		         //this�� �Բ� ���Ұ� 
		b = 100;
		c = 200;
		System.out.println("sub ������...");
	}

	public void write() {
		// System.out.println(a); //private �̹Ƿ� �ٷ� ���� �Ұ� -> ���� print�θ����
		System.out.println("sub : " + b + " : " + c);
	}
}