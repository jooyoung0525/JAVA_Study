package ex0721_Scanner;

public class Type_Conversion1 {
	public static void main(String[] args) {
		byte a, b=10;
		a ='A'; // ����A = 65�̱� ������ ������ �߻����� ����.
		// a = 200; ������ ����
		System.out.println(a+","+b);
		
		a=(byte)400; //��������ȯ ������ �߸����� �߻�
		System.out.println(a); //-112

		a=(byte)40000; //�����÷ο찡 �߻��Ѵٰ� ��� ������ �Ǵ°� �ƴ� -> �Ǿ��ڸ��� 0�̱� ������ ���
		System.out.println(a); //64
		
		int c =65,d;
		d = 1_0_1; //_ --> JDK7���� ��밡��. '_'�� ���� ������ �ڸ����� ���а���.
		System.out.println(d); //101
		
		
		char e;
		//e = c; //������ ����. ���� �ڷ���(char)�� ū �ڷ���(int)�� �����Ͽ��� ����.
		e = (char)c; // int -> char ��������ȯ
		System.out.println(c+","+e); //c = 65 , e = A	
	}
}