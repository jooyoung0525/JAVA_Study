package ex0825;

public class Lambda2 {
	public static void main(String[] args) {
		
		//�Ű����� 1��, ����Ÿ�� void ���ٽ� ==> 1) , 2), 3) ��� ���� ���.
		// 1) User3 obj = (int a) -> {int n = a+10; System.out.println(n);};
		// 2) User3 obj = (a) -> {int n = a+10; System.out.println(n);};   ==> ��ȣ�ȿ� Ÿ�ԾȽ��ָ� �˾Ƽ� �ν�����
		 User3 obj = a -> {int n = a+10; System.out.println(n);};   //==> �Ű����� �ϳ��̸� ��ȣ��������
		
		obj.sub(5);
	}
}

@FunctionalInterface //���ٰ� �������� �ʴ� ��� ����
interface User3{
	public void sub(int a);
}