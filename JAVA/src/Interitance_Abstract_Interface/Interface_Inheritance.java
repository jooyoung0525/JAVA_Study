package Interitance_Abstract_Interface;

public class Interface_Inheritance {
	public static void main(String[] args) {
		InterA ob = new Demo1(); //print�� ���ٰ��� -> InterA�� ������ �ִ°� print
		ob.print();
		
		Demo1 dd = (Demo1)ob; //�ٿ� ĳ����
		dd.fun();
	}
}



interface InterA {
	public void print();
}

interface InterB{
	public void write();
}

//�������̽��� ���� ��� ����
interface InterC extends InterA,InterB{ 
	public void fun();
}


class Demo1 implements InterC{  //�޼ҵ� 3��

	@Override
	public void print() {
		System.out.println("print...");
	}

	@Override
	public void write() {
		System.out.println("write...");
	}

	@Override
	public void fun() {
		System.out.println("fun...");
	} 
	
}