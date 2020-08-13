package ex0812_Exception_Generic;

public class ThrowsException_Ex6 {
	public static void main(String[] args) {
		User16 obj = new User16();
		
		try {
			obj.set(-5);
			int n = obj.getValue();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("main : "+e.getMessage());
		}
	}
}
class User16 {
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) throws Exception {
		//예외를 건네준다.
		if(value < 0) {
			throw new Exception("0이상만 가능합니다.");
		}
		this.value = value;
	}
	public void set(int value) throws Exception {
		// 예외를 건내준다.
		//예외를 건내주지 않으면 main에서 예외가 발생되지 않는다.
		try {
			setValue(value);
		} catch (Exception e) {
			throw e; // 예외를 다시 던진다.
//			System.out.println(e.getMessage());
		}
	}
}