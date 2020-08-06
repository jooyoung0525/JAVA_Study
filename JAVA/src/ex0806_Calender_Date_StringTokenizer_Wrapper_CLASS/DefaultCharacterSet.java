package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.io.UnsupportedEncodingException;

public class DefaultCharacterSet { //split���� �ص� ��
	public static void main(String[] args) {
		String s = "���ѹα�"; //������ 2byte�� ���������� utf-8�� �ѱ��� 3byte������
		byte[] b;
		
		//file.encoding����Ʈ ĳ���ͼ�
		//���ڿ��� ������� ��������
		//���ڿ��� ����Ʈ ĳ���� �� : windows -> MS949 : EUC-KR�� ����
		System.out.println("�⺻ ���ڼ�:"+System.getProperty("file.encoding")); // �⺻ ���ڼ�:MS949
		
		
		//����Ʈ ĳ���� ������ ����Ʈ �迭�� �ڵ尪 ����
		b=s.getBytes();
		System.out.println("���� : "+b.length);
		for(byte a : b) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		
		//utf-8�� ����Ʈ �迭�� �ڵ尪�� ����
		System.out.println("utf-8...");//UnsupportedEncodingException => ���ܸ� ������� �ʾұ� ������ ����
		try {
			b = s.getBytes("utf-8");
			System.out.println("���� : "+b.length);
			for(byte a : b) {
				System.out.print(a+" ");
			}
			System.out.println();
			
			
			String s1 = new String(b); //����Ʈ ĳ���� ���� ���
			String s2 = new String(b,"utf-8");
			
			System.out.println(s1); //�ѱ� ����. utf-8��  ms949�� ��ȯ�ؼ�
			System.out.println(s2);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		
		
	}
}
