package ex0805_String_StringBuffer_StringBuilder_API;

public class API_String2 {
	public static void main(String[] args) {
		
		// "Korea"���ڿ��� ���Ǯ�� ����Ǹ� ����� �ּҸ� s1�� �Ҵ�
		//  �ι�° ������ ���Ǯ�� "Korea"���ڿ��� �����ϴ��� 
		//  intern() �޼ҵ�� �˻��Ͽ� �����ϸ� ������ �ּҸ� s2�� ����
		//  �������� ������ ���ο� �ּҸ� ��ȯ
		
			String s1 = "Korea"; 
			String s2 = "Korea";
	
			System.out.println(s1==s2); //�ּҰ� ����
			
			s1 = "abc";      //"abc" ���ڿ��� ����� �ּҸ� s1�� ����
			s1 = s1+"xyz";   //s1+"xyz"="abcxyz"ó�� ���ڿ���
			                 //����Ǹ� ���ο� ������ �޸𸮸� �Ҵ��ϰ� �Ҵ�� �ּҸ� ��ȯ
			                 //���� "abc"�� ����� ������ �������÷����� ����� �ȴ�. --> �޸𸮸� ȸ��
			                 //��, ���ڿ��� �Һ��̴�.
			
			s2 = s2+30; // ���ڿ� + �ٸ��ڷ��� => ���ڿ�
			System.out.println(s2);
	}
}
