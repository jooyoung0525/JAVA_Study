package ex0720_Print_NumType;

public class Number_Type {
	public static void main(String[] args) {
		int a;
		
		a = 100;
		System.out.println(a);
		
		a = 0b100; // '0b'�� 2������ ����. ����� 4
		System.out.println(a);
		
		a = 0100;  // '0'�� 8������ ����. ����� 64
		System.out.println(a);
		
		a = 0x100; // '0x'�� 16������ ����. ����� 256
		System.out.println(a);
		
		//a = 0b123; //������ ����. 2�������� 123����
		//a = 019;   //������ ����. 8�������� 19����

		a = 0xaf; // (10*16 + f*15 = 160+15 = 175)
		System.out.println(a);
	}
}
