package ex0812_Exception_Generic;

public class Generics_Ex4 {

	public static void main(String[] args) {
		String s = "seoul";
		Object obj= s;
		System.out.println(obj); // 업케스팅 가능
		
		User22<String> uu = new User22<>();
		uu.set("seoul");
//		User22<Object> x = uu;// 컴오류 : 제네릭은 업캐스팅은 불가능
		// 제네릭은 형이 엄격하다.
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
