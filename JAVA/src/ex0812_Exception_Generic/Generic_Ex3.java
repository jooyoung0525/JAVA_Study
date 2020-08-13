package ex0812_Exception_Generic;

public class Generic_Ex3 {
	
//�Ķ���Ͱ� 2���� ���׸� Ŭ����
	
	public static void main(String[] args) {
		User21<String, Integer> uu = new User21<>();
		uu.set("seoul", 1000);
		uu.print();
		
	}

}
class User21<T, U>{
	private T t;
	private U u;
	
	public void set(T t, U u) {
		this.t=t;
		this.u=u;
	}
	public void print() {
		System.out.println("T: "+t.getClass().getName()+","+t);
		System.out.println("U: "+u.getClass().getName()+","+u);
	}
}
