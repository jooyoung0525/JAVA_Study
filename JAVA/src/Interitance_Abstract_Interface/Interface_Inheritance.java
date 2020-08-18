package Interitance_Abstract_Interface;

public class Interface_Inheritance {
	public static void main(String[] args) {
		InterA ob = new Demo1(); //print만 접근가능 -> InterA가 가지고 있는게 print
		ob.print();
		
		Demo1 dd = (Demo1)ob; //다운 캐스팅
		dd.fun();
	}
}



interface InterA {
	public void print();
}

interface InterB{
	public void write();
}

//인터페이스는 다중 상속 지원
interface InterC extends InterA,InterB{ 
	public void fun();
}


class Demo1 implements InterC{  //메소드 3개

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