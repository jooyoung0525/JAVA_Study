package ex0722;

public class Increment2 {
	public static void main(String[] args) {
		
		char a;
		
		a='A';
		//a=a+1; -> ������ ����  // ���� + ���� = ����, a�� �������̶� int�� a�� ���� �� ����
		//a=(char)(a+1);
		a++; //����ȯ�� �Ͼ�� �ʴ´�. -> 1�� �����ϴ°Ÿ� ����ȯ�� �ؼ� a+1�� ����ϴ°ź��� ��.
		System.out.println(a); //B
		
		int b,c;
		b = 0;
		c = b---b; //-> b - (--b) => 0 - (-1) => 1
		System.out.println(c); //1 
		
		System.out.println(3 / 0.0); //Infinity
		System.out.println(3 % 0.0); //NaN -> ���ڰ� �ƴ϶�� ��
	}
}
