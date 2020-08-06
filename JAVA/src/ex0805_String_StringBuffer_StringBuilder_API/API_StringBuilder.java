package ex0805_String_StringBuffer_StringBuilder_API;

public class API_StringBuilder {
	public static void main(String[] args) {
	
		
		StringBuilder sb1 = new StringBuilder("korea");
		StringBuilder sb2 = new StringBuilder("korea");
		
		System.out.println(sb1==sb2); // 주소비교. false
		System.out.println(sb1.equals(sb2)); // 주소비교. false --> String 클래스에서만 equals가 값 비교!!
		
		
		//값 비교는 String으로 변환후에
		//toString() : String으로 변환
		System.out.println(sb1.toString().equals(sb2.toString())); //true
		
		
		StringBuilder sb = new StringBuilder();
		
		//문자열 추가(가장 뒤에)
		sb.append("korea");
		sb.append("seoul");
		System.out.println(sb); //koreaseoul
		
		//String으로 변환
		String s = sb.toString();
		System.out.println(s);//koreaseoul
		
		//문자열 길이
		System.out.println(sb.length()); //10
		
	}	
}
