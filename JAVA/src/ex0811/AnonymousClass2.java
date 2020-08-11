package ex0811;

public class AnonymousClass2 {
	public static void main(String[] args) {
		Object ob1 = new Object();
		System.out.println(ob1); //java.lang.Object@�ؽ��ڵ�
		
		User8 ob2 = new User8();
		System.out.println(ob2); //Hi
		
		
		//���2) �͸��� Ŭ������ ����
		Object ob3 = new Object() {
			@Override
			public String toString() {	
				return "Hi";
			}
		};
		System.out.println(ob3); //Hi
		
		
		
		//�͸�Ŭ����
		Test8 tt = new Test8() {
			
			@Override
			public void print(String title, int s) {
			System.out.println(title+s);
			}
		};
		tt.print("��:",55);
		
	}
}


//ob1����Ʈ�ϸ� Hi����ϰ����
//���1) Ŭ������ �����ؼ� toString ������.
class User8{
	
	@Override
	public String toString() {
		return "Hi";
	}
}

interface Test8{
	public void print(String title, int s);
}