package ex0812_Exception_Generic;

public class Generics_Ex4 {

	public static void main(String[] args) {
		String s = "seoul";
		Object obj= s;
		System.out.println(obj); // ���ɽ��� ����
		
		User22<String> uu = new User22<>();
		uu.set("seoul");
//		User22<Object> x = uu;// �Ŀ��� : ���׸��� ��ĳ������ �Ұ���
		// ���׸��� ���� �����ϴ�.
	}

}
class User22<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public void print() {
		System.out.println(t.getClass().getName()+":"+t);
	}
}
