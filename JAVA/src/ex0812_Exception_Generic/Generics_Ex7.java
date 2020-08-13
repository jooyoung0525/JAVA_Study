package ex0812_Exception_Generic;

public class Generics_Ex7 {
	public static void main(String[] args) {
		User26<Integer> obj = new User26<>();
		obj.set(10);
//		User26<Number> obj2 = obj;// ��ĳ������ �ȵȴ�
		
		User26<?> obj2 = obj; // ���ϵ� ī���� �Ѵ�.
		// ���׸��� Ÿ���� �������� ���� ����
//		obj2.set(20);// Ÿ���� �������� �ʾ����� �Ŀ����̴�.
		
		obj2.print();// �ش� print �޼ҵ�� T�� ���������� �ʱ⶧���� �����ϴ�.
		System.out.println(obj2.get()); // �ܼ��� ���� �������°� �����ϴ�.
	}
}
class User26<T>{
	private T t;
	public void set(T t) {
		this.t =t;
	}
	public T get() {
		return t;
		
	}
	public void print() {
		System.out.println("��� : "+ t);
	}
}