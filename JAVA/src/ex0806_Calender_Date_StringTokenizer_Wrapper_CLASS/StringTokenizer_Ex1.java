package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.StringTokenizer;

public class StringTokenizer_Ex1 { //split���� �ص� ��
	public static void main(String[] args) {
		String s = "����,�λ�,�뱸,����,��õ";
		
		//���ڿ��� �����ڷ� �з�
		StringTokenizer st = new StringTokenizer(s,","); //s�� ����, ","�� ������ 
		                                                 //s�� ,�� ����
		
		//countTokens:�Ľ��� �� ���ڿ� ��
		String[] ss = new String[st.countTokens()]; //�����ڷ� �������� ���ڿ� �� ��ȯ
		
		int n = 0;
		while(st.hasMoreTokens()) { // �Ľ̵� ���ڿ��� �����ϸ� true, ������ false
			ss[n++]=st.nextToken(); // �Ľ̵� ���ڿ�
		}
		
		for(int i = 0; i<ss.length; i++) {
			System.out.println(ss[i]);
		}
	}
}
