package ex0812_Exception_Generic;

public class Generic_Ex2 {
	public static void main(String[] args) {
		User20<String> obj = new User20<String>(); // JDK 5,6은 뒤에도 파라미터 넣어야함
		User20<Integer> obj1 = new User20<>();//JDK 7부터는 생략 가능
		
		obj.set("aaa");
		obj1.set(123);
//		class java.lang.String
//		class java.lang.Integer
		Integer ii = obj1.get();
		//캐스팅 불필요
		
		Test20 tt = new Test20();
		tt.set(30);
//		Integer ii2 = tt.get();// 캐스팅이 필요함
	}
}
class User20<T>{
	private T t;
	
	public void set(T t) {
		System.out.println(t.getClass().getName());
		this.t=t;
	}
	
	public T get() {
		return t;
	}
}
class Test20{
	private Object obj;
	public void set(Object obj) {
		this.obj = obj;
	}
	public Object get() {
		return obj;
	}
}