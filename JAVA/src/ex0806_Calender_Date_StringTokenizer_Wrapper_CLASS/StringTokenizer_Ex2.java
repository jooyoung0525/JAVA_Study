package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.StringTokenizer;

public class StringTokenizer_Ex2 { //split���� �ص� ��
	public static void main(String[] args) {
		String s = "����,�λ�:�뱸;����,��õ";
		
		//���ڿ��� �����ڷ� �з�
		//StringTokenizer st = new StringTokenizer(s,",:;"); //",:;"�� �����ڰ� 3�� 
		StringTokenizer st = new StringTokenizer(s,",:;",true); //true�̸� �����ڵ� nextToken()�� �Ѱ� ���� 
		
		
		String str;
		while(st.hasMoreTokens()) {
			str = st.nextToken();
			System.out.println(str);
		}
		
	}
}
