package ex0805_String_StringBuffer_StringBuilder_API;

public class API_String2 {
	public static void main(String[] args) {
		
		// "Korea"문자열은 상수풀에 저장되며 저장된 주소를 s1에 할당
		//  두번째 문장은 상수풀에 "Korea"문자열이 존재하는지 
		//  intern() 메소드로 검색하여 존재하면 동일한 주소를 s2에 대입
		//  존재하지 않으면 새로운 주소를 반환
		
			String s1 = "Korea"; 
			String s2 = "Korea";
	
			System.out.println(s1==s2); //주소가 동일
			
			s1 = "abc";      //"abc" 문자열이 저장된 주소를 s1에 대입
			s1 = s1+"xyz";   //s1+"xyz"="abcxyz"처럼 문자열이
			                 //변경되면 새로운 영역에 메모리를 할당하고 할당된 주소를 반환
			                 //기존 "abc"를 저장된 공간은 가비지컬렉터의 대상이 된다. --> 메모리를 회수
			                 //즉, 문자열은 불변이다.
			
			s2 = s2+30; // 문자열 + 다른자료형 => 문자열
			System.out.println(s2);
	}
}
