package ex0720;

public class Type_System {
	public static void main(String[] args) {	
		//byte < short < int < long (������ �ڷ��� ũ��)
		
		//�ϳ��� ���� ����
		byte a;
		//�������� ��������
		short b, c;
		//���� ����� ���ÿ� �ʱ�ȭ
		int d = 10;
		long e = 10, f; //������ �����ϰ� �����ϸ� !�� ���ʿ� ����ǥ�� (���װ� �� �� ������ �˷���)
		
		// System.out.println(a); -> ������ ���� (������ Ʋ���� �߻�) //a�ʱ�ȭ ���� ���� a�� ��� �Ұ�
		
		a=10;
		System.out.println(a);
		
		a=20; //������ ������ �ٸ� ���� ������ �ִ�.
		System.out.println(a);
		
		//a=200; -> ������ ����. byte�� ����: -128~127
		
		b = 10;
		c = 20;
		System.out.println(b+c);
		
		// n=b+c; short�� ����Ұ�  --> short + short = (������)int��
			      // ū �ڷ����� ����� ���� �ڷ����� ���� �Ұ�
				  // ������ ����
		
		d = b+c;
		System.out.println(d);
		
		System.out.println(e);
		
		//f=2200000000; //22���� int������ ����� ������ ���� �߻� -> �����Ͽ���
		f = 2200000000L; //long�� ���ͷ� -> ���� �ڿ� L�� �ٿ���
		System.out.println(f);
	}
}
