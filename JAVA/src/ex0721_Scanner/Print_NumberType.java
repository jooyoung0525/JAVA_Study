package ex0721_Scanner;

public class Print_NumberType {
	public static void main(String[] args) {
		int a,b;
		
		a=7;
		b='7'; //�ƽ�Ű�ڵ� 55
		System.out.println(a+","+b);
		
		
		char c;
		c='\u0041'; // 0041�� �����ڵ带 16������ ǥ�� --> 1*1 + 16*4 = 65
		System.out.println(c); // A
		
		c ='\101'; // 101�� �����ڵ带 8������ ǥ�� --> 1*1 + 8*8 = 65 
		System.out.println(c); // A
		
		c='\uFFFF'; // 65535�� 16����
		System.out.println(c); //�̻��� ���� ��µ�
		
		a = c; // int(4byte) <- char(2byte) ����
		System.out.println(a); // 65535
		
		
	}
}
