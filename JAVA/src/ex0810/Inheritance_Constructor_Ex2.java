package ex0810;

public class Inheritance_Constructor_Ex2 {
	public static void main(String[] args) {
		
	}
}


class Test2{
	int a;
	int b;
	
	public Test2(int a, int b) { //���� 2��¥�� ������
		this.a = a;
		this.b = b;
		System.out.println("super ������...");
	}
	
	public void write() {
		System.out.println(a+" : "+b);
	}
}


//super Ŭ������ ���ڰ� �ִ� �����ڸ� �����ϸ�
//  sub Ŭ������ �ݵ�� �����ڸ� ����� ������ ���� �տ���
//  ����� super(��)���� ���� �����ڸ� ȣ���ؾ���.
class User2 extends Test2{

	
	
	/*
	public User2() {
		super(); //����! ����Ŭ������ ���ڰ� 2���̹Ƿ� �������� ���� 
		
	}*/
	
	
	public User2() {
		//this�� �ڱ� Ŭ������ ������ �θ�
		this(10,5); //this �� �Ʒ��� User2(a,b)ȣ�� -> super(a,b)ȣ�� 
	}
	public User2(int a, int b) {
		super(a,b);
		
	}
}