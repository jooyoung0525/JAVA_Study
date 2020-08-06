package ex0805_String_StringBuffer_StringBuilder_API;

public class API_StringBufferStringBuilder {
	public static void main(String[] args) {
		// StringBuffer, StringBuilder
		//  : 가변적인 문자열을 처리하는 경우 String 보다 유용
		// StringBuilder : 동기화 지원안함. StringBuffer보다 빠름.
		// StringBuffer : 동기화 지원. 멀티스레드 환경에서 안전.
	
		
		
		/*
		// 아래와 같은 "가변적인 처리"를 하는 경우 욕을 배불리 먹음
		// 이런 경우는 StringBuffer나 StringBuilder를 사용한다.
		String s= "a";
		s+="b"; //이런 연산은 메모리도 다시 회수해야 하기때문에 성능이 안 좋음
		s+="c";
		s+="x";
		s+="t";
		*/
		
		/*
		//"가변적인 처리가 아님!!"
		String s;
		s = "a"+"b"+"c"; //가변적인 처리가 아니며
		     // 내부적으로 StringBuilder를 이용하여
		     // 문자열을 결합하므로 속도가 빠르다.
		*/
		
		
		//"가변적이지 않은 문자열" 처리에서 
		//StringBuffer나 StringBuilder를 사용하면 성능 저하의 요인이된다.
		//-> StringBuffer나 StringBuilder는 결국 최후에는 String으로 변경해야하기 때문!
		
	}
}
