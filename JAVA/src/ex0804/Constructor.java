package ex0804;

public class Constructor {
	public static void main(String[] args) {

		Demo1 ob = new Demo1();
		System.out.println(ob.a); // ������...
		                          // 10
		
	}
}


class Demo1{
	int a;
	int b;
	
	/*
	 -- ������
	    - Ŭ������ ������ �̸��� ���´�.
	    - �ϳ��� Ŭ�������� �ϳ� �̻��� �����ڸ� ���´�.
	    - �����ڴ� ���� Ÿ���� �������� �ʴ´�.
	    - �����ڴ� �Ϲ� �޼ҵ�ó�� ȣ�� �� �� ������
	          ��ü�� ������ �� new ������ ����Ѵ�.
	    - new ������(); ó�� �����ڸ� ȣ���ϸ�
		   ��ü�� �޸𸮰� �Ҵ�ǰ�
	          �������� ��ü�� ����Ǿ� �ʱ�ȭ�� ����Ѵ�.
	    - �����ڴ� �ߺ� ���ǰ� �����ϴ�.
	    - �����ڸ� ������ ������ �����Ϸ��� 
	          �ƹ��� �ڵ嵵 ���� ����Ʈ �����ڸ� �����.
	      public Ŭ������() {} 
	 */
	public Demo1() {
		System.out.println("������...");
		a = 10;
		b = 20;
	}
	
	public void write() {
		System.out.println(a+":"+b);
	} 
}