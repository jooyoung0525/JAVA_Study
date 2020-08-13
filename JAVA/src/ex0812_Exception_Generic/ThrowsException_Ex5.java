package ex0812_Exception_Generic;

public class ThrowsException_Ex5 {
	public static void main(String[] args) {
		User14 obj = new User14();
		try {
			// 안에 변수르 선언하면 try 안에서만 유효
			obj.setValue(-5);
			System.out.println(obj.getValue()); // 0이 나온다.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


class User14 {
	private int value;

	// checked Exception
	public void setValue(int value) throws Exception {
		//예외 넘기기
		if (value < 0) {
			throw new Exception("0이상만 가능합니다");
			//명시적 예외 발생
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}