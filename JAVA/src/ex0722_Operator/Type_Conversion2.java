package ex0722_Operator;

public class Type_Conversion2 {
	public static void main(String[] args) {
		byte a = 10, b = 5, c;
		int d;
		
		// c = a+b; //������ ���� -> byte + byte = int + int => int --> int ���� byte�� ���� �� ����
		c = (byte)(a+b); // (byte)a+b -> a�� byte�� �ٲ���
		d = a+b;
		System.out.println(d);
		
		
		// a = 200;  //������ ���� -> overflow�߻�
		a=100;
		b=70;
		c=(byte)(a+b); //����ȯ ������ ����� �߸� ����
		System.out.println(c); //-86
		
		
		char c1 = 'A', c2 = 'B', c3;
		//c3 = c1+c2; ������ ���� -> char + char  => int + int => int
		d = c1+c2;
		System.out.println(d);

		c3 =(char) (c1 + 2); // A���������� ���ڸ� �˰� ���� ��
		System.out.println(c3);		
	}
}
