package ex0810;

public class Interface_Ex3 {
	public static void main(String[] args) {
		
		
		IEx obj = new Demo2();
		obj.print(); 
		
		Demo2 dd = (Demo2)obj;
		dd.write();
		
		
		
	}
}




interface IEx{
	public void print();
}

interface ITest{
	public void write();
}



class Demo2 implements IEx,ITest{

	@Override
	public void write() {
		System.out.println("write...");
	}

	@Override
	public void print() {
		System.out.println("print...");
	}
	
	
	public void fun() {
		System.out.println("fun...");
	}
}