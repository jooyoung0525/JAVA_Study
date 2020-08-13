package ex0812_Exception_Generic;

public class ThrowsException_Ex3 {
	public static void main(String[] args) {
			User13 obj = new User13();
			obj.setValue(-5);
			System.out.println(obj.getValue()); // 0이 나온다.
	}
}

//잘못 짠 코드
class User13{
	private int value;
	
	public void setValue(int value)  {
		if(value<0) {
			return;
		}
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}