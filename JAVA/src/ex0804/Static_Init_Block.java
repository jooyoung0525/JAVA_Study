package ex0804;

public class Static_Init_Block {
	public static void main(String[] args) {

		Demo9 ob; //���������� ���� �� ���´� ���� Ŭ������ �ε��Ǳ� ��
		
		// Ŭ���� ������ ����ϹǷ� Ŭ������ �ε���
		//     �Ʒ� 1)~4)�������� �� �ѹ��� ����
		// 1) static ������ �޸� �Ҵ��� ��.
		// 2) static ������ �ʱ�ȭ �۾�
		//    c <- 0 , d <- 20
		// 3) static �ʱ�ȭ ���� ����
		//    c <- 5
		System.out.println(Demo9.c); //static �ʱ�ȭ ��
		                               //5
		
		
		
		
		ob = new Demo9(); //��ü�� ����
	 // 1) Ŭ������ �ε��� �Ͼ�Ƿ� ���� �Ʒ� �۾��� �ѹ��� ����
	 //	   static���� �޸� �Ҵ�, static �ʱ�ȭ,
     //    static ��� ����		 
  	 // 2) ��ü�� ���� �ɶ� ����
	 //    �ν��Ͻ����� �޸� �Ҵ�,
	 //    �ʱ�ȭ, �ʱ�ȭ �� ����, ������ ��ü ����
		
	  ob.write();
	}
}


class Demo9 {
	
	int a; 
	int b = 10;
	static int c;
	static int d = 20;
	
	{ 
		c= 20;
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��...");
	}
	
	static { 
		//static �ʱ�ȭ ��
		c=5;
		System.out.println("static �ʱ�ȭ ��");
		
	}
	
	public Demo9() {
		System.out.println("������...");
	}
	
	public void write() {
		System.out.println(a+":"+b+":"+c+":"+d);
	}
}