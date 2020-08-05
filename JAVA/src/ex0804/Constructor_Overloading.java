package ex0804;

public class Constructor_Overloading {
	public static void main(String[] args) {

		Demo3 ob1 = new Demo3();
		ob1.write(); //인자없는 생성자...
		             //10
		
		Demo3 ob2 = new Demo3();
		ob2.write(); //인자있는 생성자...
		             //20
		
	}
}


class Demo3{
	int a;
	
	public Demo3() {
		System.out.println("인자없는 생성자...");
		a = 10;
	}
	
	public Demo3(int x) {
		System.out.println("인자있는 생성자...");
		a=x;
	}
	
	public void write() {
		System.out.println(a);
	} 
}