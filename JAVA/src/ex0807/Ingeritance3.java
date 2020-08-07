package ex0807;

public class Ingeritance3 {
	public static void main(String[] args) {
		Test3 t = new Test3();
		User3 u = new User3();
		
		t.write(); //super write...
		u.write(); //sub write...
		
		//t.sub(); 
		            /* ������ ����. ����Ŭ������ ����Ŭ������ �޼ҵ忡 ���� �Ұ�.
		            * �ƹ����� �¾�� �ڽ��� ������ �¾����, �ڽ��� ���� �¾�� ��찡 ����
		            * �¾�°� = �޸��Ҵ�.
		            */
		
		//Object ob = u; //up casting. ������ ����
		Test3 tu = u; // up casting .������ ����
		              // Test3 tu =>������ User3 ��ü => u��(��������)�� �־���
		System.out.println(t); //ex0807.Test3@
		System.out.println(tu); //ex0807.User3@
		
		tu.write(); //sub write...
		
		//��ü�� ��ĳ���õȰ�� �����޼ҵ尡 �������� �����ǵ� ���
		// �������� �����ǵ� ��� �޼ҵ带 ȣ���ϸ� �����ǵ� �޼ҵ� ȣ��
		
		System.out.println(tu.c);//30 --> �ʵ�� ������ �ڱ�Ŭ���� �켱!
		// ��ü�� ��ĳ���õ� ��쿡�� �ʵ�� ������ �ڱ���� �켱������ ����.

		//tu.sub(); ������ ����.
		//System.out.println(tu.d);//������ ����
		 
		//User3 ut = tu; //������ ���� -> ������ü�� ������ ���� �� ����
		
		User3 ut = (User3)tu; //down casting
		  // down casting�� �ݵ�� casting�ؾ���
		  // down casting�� up casting �Ѱ͸� ����
		System.out.println(ut);//ex0807.User3@
		System.out.println(ut.c); //100
		
		//User3 ut2 = (User3)t; // ��Ÿ�� ����. down casting�� up casting�� ��쿡�� �� �� ����
		
		if(tu instanceof User3) {
			//true�� ��쿡�� down casting����
			System.out.println("User3 ��ü");
		}
		
		if(t instanceof User3) { //false
			User3 ut3 =(User3)t;
		}else {
			System.out.println("tt�� User3��ü�� �ƴ�");
		}
		
		int a = tu.c;
		System.out.println(a); //30
		
		//a = (User3)tu.c; //��Ÿ�� ���� 
		 a=((User3)tu).c; //.�� ()���� ����ӵ��� ������ ������ �ٿ�ĳ������ �����ϰ� c�� ����������� 
		System.out.println(a); //100
			
	}
}


class Test3{
	private int a = 10;
	int b = 20;
	int c = 30;
	
	
	public void print() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public void write() {
		System.out.println("super write...");
	}
}


class User3 extends Test3{
	int c = 100;
	int d = 200;
	
	public void sub() {
		System.out.println(b+":"+c+"d");
	}
	
	//Override. ������
	public void write() {
		System.out.println("sub write...");
	}
	
	
	public void method() {
		System.out.println(c);//100
		System.out.println(this.c); //100 -> Ŭ���� ���ο����� ����
		System.out.println(super.c); //30  -> Ŭ���� ���ο����� ����
		
		write(); //sub write
		super.write(); //super write
	}
}