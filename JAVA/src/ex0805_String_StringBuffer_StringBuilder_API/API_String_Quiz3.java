package ex0805_String_StringBuffer_StringBuilder_API;

public class API_String_Quiz3 {
	public static void main(String[] args) {
		/*
		 * �������¹�ȣ�����
		 */
		
		String accountNo ="020-008-0000001";
		
		int oper = accountNo.lastIndexOf("-");
		String start = accountNo.substring(0,oper);
		String last = accountNo.substring(oper+1);
	
		last = String.format("%07d", Integer.parseInt(last)+1); //7�ڸ��� �����, ������ 0���� ä���
		
		accountNo = start+"-"+last; // ���ڿ����� += �� ������ �ϸ�ȵ�.
		System.out.println(accountNo);
	}
}
