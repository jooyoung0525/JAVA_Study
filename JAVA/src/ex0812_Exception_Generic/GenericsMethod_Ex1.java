package ex0812_Exception_Generic;

public class GenericsMethod_Ex1 {
//���ʸ� �޼ҵ�
	public static void main(String[] args) {
		User23 ob = new User23();
		ob.print("String");
		ob.print(123);
	}

}
class User23{
	// ���׸� �޼ҵ�
	public <U> void print(U u) {
		System.out.println("U : "+u.getClass().getName());
	}
}