package ex0721;

public class Printf {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int c = a+b;
		
		System.out.println(a+"+"+b+"="+c);
		
		System.out.printf("%d + %d = %d\n",a,b,c); 
		// printf ==> ���Ŀ� ���� ������ ����� �� ���
		// System.out.prinf("����",��);
		// %d : ���� ��ȯ����
		
		System.out.format("%d + %d = %d \n",a,b,c); // printf == format
	}
}
