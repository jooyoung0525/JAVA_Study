package ex0812_Exception_Generic;

public class Generics_Ex5 {

	public static void main(String[] args) {
		User24<Integer> obj = new User24<>();
		obj.set(10);
		System.out.println(obj.get());
		
//		User24<String> obj = new User24<>();
		// ������ ���� : ���ѵ� �Ķ�����̱� ����
		//number ���� Ŭ������ �����ϴ�.
	}

}
//���ѵ�  Ÿ�� �Ķ����
//extends�� ���Ͽ� ������ Ŭ������ ��ӹ޴´�.
class User24<T extends Number>{
	private T t;
	public void set (T t) {
		this.t =t;
	}
	public T get() {
		System.out.println(t.getClass().getName());
		return t;
	}
}