package ex0812_Exception_Generic;

public class ThrowsException_Ex4 {
	public static void main(String[] args) {
		User15 obj = new User15();

		/*
		 * obj.setValue(-5); 
		 * System.out.println(obj.getValue()); 
		 * 런타임 에러 발생
		 */
		
		// unchecked 예외처리 
		try {
			 obj.setValue(-5); 
			 System.out.println(obj.getValue()); 
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end...");
	}
}

class User15 {
	private int value;

	// unchecked Exception
	public void setValue(int value) {
		if (value < 0) {
			throw new RuntimeException("0이상만 가능합니다");
			// 명시적 예외(런타임) 발생
			// unchecked는 throws 할 필요 x
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}