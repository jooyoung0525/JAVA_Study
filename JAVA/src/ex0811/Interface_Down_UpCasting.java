package ex0811;

public class Interface_Down_UpCasting {
	public static void main(String[] args) {
		Test4 obj = new User4(); //업캐스팅
		obj.fun(); //가능
		
		//obj.sub(); 컴파일 오류
		((User4)obj).sub(); //다운캐스팅
		
	}
}

interface Test4{
	public void fun();
}

class User4 implements Test4{

	@Override
	public void fun() {
		System.out.println("fun");
	}
	
	public void sub() {
		System.out.println("sub");
	}
	
}