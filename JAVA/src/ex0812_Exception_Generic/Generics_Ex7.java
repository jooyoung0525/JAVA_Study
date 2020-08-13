package ex0812_Exception_Generic;

public class Generics_Ex7 {
	public static void main(String[] args) {
		User26<Integer> obj = new User26<>();
		obj.set(10);
//		User26<Number> obj2 = obj;// 업캐스팅은 안된다
		
		User26<?> obj2 = obj; // 와일드 카드라고 한다.
		// 제네릭의 타입이 결정되지 않은 상태
//		obj2.set(20);// 타입이 결정되지 않앗으니 컴오류이다.
		
		obj2.print();// 해당 print 메소드는 T에 의존적이지 않기때문에 가능하다.
		System.out.println(obj2.get()); // 단순히 값을 가져오는건 가능하다.
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
		System.out.println("출력 : "+ t);
	}
}