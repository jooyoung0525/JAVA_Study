package ex0721;

public class Add_String {
	public static void main(String[] args) {
		
		String s;
		
		//문자열 + 문자열  => 문자열 결합
		//문자열 + 다른 자료형 => 문자열로 결합
		
		s ="Korea"+"seoul";
		System.out.println(s); // Koreaseoul
		
		s="Korea"+9;
		System.out.println(s); // Korea9
		
		s = 'A'+10+"Korea"; // 문자 + 정수 => 정수
		System.out.println(s); // 75Korea
		
		s = 'A'+"Korea"+10; // 문자 + 문자열 => 문자열 + 정수 = 문자열 
		System.out.println(s); // AKorea10
		
		s = "Korea"+'A'+10; // 문자열 + 문자 => 문자열 + 정수 = 문자열
		System.out.println(s); // KoreaA10
		
		s = 'A'+'B'+"Korea"; //문자 + 문자 => 문자 + 문자열 = 문자열
		System.out.println(s); //131Korea
	}
}