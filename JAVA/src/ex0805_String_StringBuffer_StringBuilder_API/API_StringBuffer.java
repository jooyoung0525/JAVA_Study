package ex0805_String_StringBuffer_StringBuilder_API;

public class API_StringBuffer {
	public static void main(String[] args) {
				
		StringBuffer sb3 = new StringBuffer();
		
		//append
		System.out.println("�ʱ����ũ��:"+sb3.capacity());
		sb3.append("korea");
		sb3.append("seoul");
		sb3.append("���ѹα�");
		sb3.append("������");
		sb3.append("�ڹٴ�");
		
		System.out.println("���ڿ�����:"+sb3.length());
		System.out.println("����ũ��:"+sb3.capacity()); //StringBuffer�� ������ ũ�Ⱑ �þ��.
		
		int pos = sb3.indexOf("seoul");
		System.out.println(pos);
		
		
		
		
		//insert
		sb3.insert(0,"�ѱ�");
		System.out.println(sb3);
		
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(),"���");
		System.out.println(sb3);
		
		
		
		
		//delete
		sb3.delete(sb3.indexOf("������"), sb3.indexOf("������")+"������".length());
		System.out.println(sb3);
		
		sb3.delete(sb3.indexOf("���ѹα�"),sb3.length());
		System.out.println(sb3);
		
		
		
		
		//�빮�ڷ� ��ȯ�� String���� ��ȯ ��
		//�ҹ��� -> �빮�ڷ� ��ȯ 
		String a = sb3.toString().toUpperCase();
		System.out.println(a);
	
		
		
		
		
		//���ڿ��� ������ �������
		System.out.println("���ڿ� ����:"+sb3.length()); //���ڿ�����:14
		System.out.println("����:"+sb3.capacity());   //����:34
		
		
		
		
		//������ ũ�⸦ ���ڿ����̸�ŭ ���̱�
		sb3.trimToSize();
		System.out.println("����:"+sb3.capacity());
		
	}	
}
