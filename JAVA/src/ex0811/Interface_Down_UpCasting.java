package ex0811;

public class Interface_Down_UpCasting {
	public static void main(String[] args) {
		Test4 obj = new User4(); //��ĳ����
		obj.fun(); //����
		
		//obj.sub(); ������ ����
		((User4)obj).sub(); //�ٿ�ĳ����
		
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