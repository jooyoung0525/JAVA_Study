package ex0722;

public class Assignment_Operator {
	public static void main(String[] args) {
		
		int a = 10;
		a += 5; // a=a+5; ���� ���
		        // a++; a+=1;
		System.out.println(a);
		
		short b = 10;
		//b = b + 5; //������ ���� (�ڷ���) --> ���������� ĳ���� �ؾ��ϱ� ���п� ���� ������(ĳ���� ����)�� �� ����!
		b += 5; //���� �����ڴ� 
		        //byte, short, char���� int������ �� ��ȯ�� �Ͼ�� ����!
		System.out.println(b);
		
		float c = 4.5f;
		char d = 'A';
		d += c;
		System.out.println(d); // E --> 65 + 4.5 = 70.5 ==> 70 ==> 'E'
		
		
		/*
		 * <�� ��ȯ �Ͼ�� �ʴ� ������> --> �Ϲ����� ���꺸�� �ӵ��� ����! ������ ���� ����� ���� (�Ϲ����� ������ -> int�� ����ȯ)
		 * ++ , --
		 * ����������
		 * 
		 * */
	}
}
