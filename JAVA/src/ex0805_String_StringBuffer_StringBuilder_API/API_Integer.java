package ex0805_String_StringBuffer_StringBuilder_API;

public class API_Integer {
	public static void main(String[] args) {
		String s1 = "123";
		String s2 = "456";
		String s3;

		s3 = s2 + s1; //���ڿ� ����
		System.out.println(s3); //456123
		
		
		//���ڿ��� ������ ��ȯ
		int a = Integer.parseInt(s1); //java.lang�� �־ import���ص���
		int b = Integer.parseInt(s2); 
		int c = a+b; 
		System.out.println(c); // 579
		
		//s3 = c; //������ ����. �ڷ����� ��ġ���� ����
		
		//������ ���ڿ��� ��ȯ
		s3 = Integer.toString(c);
		System.out.println(s3); //579
		
		//������ 2������ ���ڿ��� ��ȯ
		s3 = Integer.toBinaryString(c);
		System.out.println(s3); //1001000011
		
	
		// ������ string�� ���ڷ� ���氡��
		//s3 ="1,123";
		//c = Integer.parseInt(s3); //��Ÿ�� ���� --> ,�������Ƿ� ���ڷ� �� �ٲ�
		//System.out.println(s3);
		
		//s3 = "00.7";
		//c = Integer.parseInt(s3); //��Ÿ�� ����
		
		//s3 = "A100";
		//c = Integer.parseInt(s3); //��Ÿ�� ����
	}
}
