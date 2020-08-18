package Interitance_Abstract_Interface;

public class AbstractClass_Override {
	public static void main(String[] args) {
		SuperA obj = new SubA();
		obj.paint(); //sub... 
		             //super...
		
		/* <<Error>>
		SuperA obj = new SuperA();
		obj.paint(); // StackOverflowError
		*/
	}
}


class SuperA{
	public void paint() {
		disp();
	}
	
	public void disp() {
		disp(); //�ڽ��� disp(); //�������̵�
		System.out.println("super...");
	}
}

class SubA extends SuperA{
	public void paint() {
		super.disp();
	}
	
	public void disp() {
		System.out.println("sub...");
	}
}