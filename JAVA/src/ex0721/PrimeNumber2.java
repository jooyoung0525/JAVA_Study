package ex0721;

public class PrimeNumber2 {
	public static void main(String[] args) {
		float a,b;
		a = 30;
		b = 'A';
		System.out.println(a+","+b); // a = 30.0 , b = 65.0
		
		// a = 0.0; // ������ ���� -> 0.0 : double �� ���ͳ�(�Ǽ��� �⺻���� double��)
		            //double���� float�� ���� �Ұ�

		
		a = 13.123456789f; //�������� �Ǽ� -> �׻� �ڿ� f����
		System.out.println(a); //13.123457 --> �Ҽ� ���� 6�ڸ� ���, �Ҽ� ���� 6�ڸ� �̻��� �ڵ� �ݿø�
		
		a = 123456789.123456789f;
		System.out.println(a); //1.23456792E8 : 1.23456792 * 10^8 -->�̻��� �� ����. float�� �����ؼ� ����ؾ���.
		
		double c;
		c=123456789.123456789;
		System.out.println(c); //1.2345678912345679E8 --> float�� ���� ������
		
		c=3.14D;
		System.out.println(c); //3.14
		
		c = 1.2e-04; //1.2 * 10^-4
		System.out.println(c);
		
		a=(float)c; //double��  float�� ����ȯ
		System.out.println(a);
		
	}
}