package ex0812_Exception_Generic;

public class Generics_Ex5 {

	public static void main(String[] args) {
		User24<Integer> obj = new User24<>();
		obj.set(10);
		System.out.println(obj.get());
		
//		User24<String> obj = new User24<>();
		// 컴파일 오류 : 제한된 파라미터이기 때문
		//number 하위 클래스만 가능하다.
	}

}
//제한된  타입 파라미터
//extends를 통하여 제한할 클래스를 상속받는다.
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