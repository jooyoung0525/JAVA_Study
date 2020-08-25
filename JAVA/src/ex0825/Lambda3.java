package ex0825;

public class Lambda3 {
	public static void main(String[] args) {
		
		//�Ű����� 2��, ����Ÿ�� int�� ���ٽ� ==> �Ʒ� ��� �������
		
		// 1) User4 u = (a,b) -> {int c = a+b; return c;};
		// 2) User4 u = (a,b) -> {return a+b;};
		User4 u = (a,b) -> a+b;
		
		System.out.println(u.add(10, 5));
	}
}

@FunctionalInterface //���ٰ� �������� �ʴ� ��� ����
interface User4{
	public int add(int a, int b);
}