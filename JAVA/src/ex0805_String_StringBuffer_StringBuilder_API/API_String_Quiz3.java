package ex0805_String_StringBuffer_StringBuilder_API;

public class API_String_Quiz3 {
	public static void main(String[] args) {
		/*
		 * 다음계좌번호를출력
		 */
		
		String accountNo ="020-008-0000001";
		
		int oper = accountNo.lastIndexOf("-");
		String start = accountNo.substring(0,oper);
		String last = accountNo.substring(oper+1);
	
		last = String.format("%07d", Integer.parseInt(last)+1); //7자리를 만들고, 공백은 0으로 채우기
		
		accountNo = start+"-"+last; // 문자열에서 += 이 연산을 하면안됨.
		System.out.println(accountNo);
	}
}
