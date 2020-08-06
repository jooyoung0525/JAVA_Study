package ex0804_Constructor_Recursion;

public class Overloading {
	public static void main(String[] args) {

		User3 ob = new User3();
		
		short a = 10;
		int b = 20;
		long c = 30;
		Short d = 40;
		
		// �⺻�ڷ����� ���� �⺻�ڷ������� ó��
		// 1���� :������ �ڷ��� , 2���� :���尡��� ū �ڷ��� (short:2byte<int:4byte), 3���� :wrapper class
		ob.print();   // void  //���ھ��� �޼ҵ�...
		ob.print(a);  // int   //int:10
		ob.print(b);  // int   //int:20
		ob.print(c);  // Long  //Long:30  //long:8byte --> 1����, 2���� �ȵ� --> 3����
		ob.print(d);  // Short //Short:40
	}
}



// overloading : �ߺ� ����
// ������ Ŭ�������� �޼ҵ��� �̸��� ���������� 
//    �Ű������� ������ �ٸ��ų� �Ű������� Ÿ���� �ٸ����
class User3{
	
	public void print() {
		System.out.println("���ھ��� �޼ҵ�...");
	}
	
	/*
	 * ������ ���� :  �Ű������� ������ (Ÿ�԰� ����) �ߺ����ǰ� �ƴϴ�.
        public int print() {
    	return 1;
        }
    */	
	
	 // Short : �⺻�ڷ����� short�� Ŭ������ ����� ���� Wrapper Ŭ����
	 public void print(Short a) {
		 System.out.println("Short:"+a);
	 }
	 
	 public void print(int a) {
		 System.out.println("int:"+a);
	 }
	 
	 // Long : �⺻�ڷ����� long�� Ŭ������ ����� ���� Wrapper Ŭ����
	 public void print(Long a) {
		 System.out.println("Long:"+a);
	 }
	 
}