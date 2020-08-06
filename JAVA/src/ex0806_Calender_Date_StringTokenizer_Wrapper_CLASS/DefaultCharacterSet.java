package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.io.UnsupportedEncodingException;

public class DefaultCharacterSet { //split으로 해도 됨
	public static void main(String[] args) {
		String s = "대한민국"; //원래는 2byte로 저장하지만 utf-8은 한글을 3byte로저장
		byte[] b;
		
		//file.encoding디폴트 캐릭터셋
		//문자열을 어떤식으로 저장할지
		//문자열의 디폴트 캐릭터 셋 : windows -> MS949 : EUC-KR과 유사
		System.out.println("기본 문자셋:"+System.getProperty("file.encoding")); // 기본 문자셋:MS949
		
		
		//디폴트 캐릭터 셋으로 바이트 배열에 코드값 저장
		b=s.getBytes();
		System.out.println("길이 : "+b.length);
		for(byte a : b) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		
		//utf-8로 바이트 배열에 코드값을 저장
		System.out.println("utf-8...");//UnsupportedEncodingException => 예외를 명시하지 않았기 때문에 문제
		try {
			b = s.getBytes("utf-8");
			System.out.println("길이 : "+b.length);
			for(byte a : b) {
				System.out.print(a+" ");
			}
			System.out.println();
			
			
			String s1 = new String(b); //디폴트 캐릭터 셋을 사용
			String s2 = new String(b,"utf-8");
			
			System.out.println(s1); //한글 깨짐. utf-8을  ms949로 변환해서
			System.out.println(s2);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		
		
	}
}
