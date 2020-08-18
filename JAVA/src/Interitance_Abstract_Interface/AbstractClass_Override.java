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
		disp(); //자식의 disp(); //오버라이딩
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