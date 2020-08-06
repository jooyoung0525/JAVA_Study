package ex0805_String_StringBuffer_StringBuilder_API;

public class API_StringBuffer {
	public static void main(String[] args) {
				
		StringBuffer sb3 = new StringBuffer();
		
		//append
		System.out.println("초기버퍼크기:"+sb3.capacity());
		sb3.append("korea");
		sb3.append("seoul");
		sb3.append("대한민국");
		sb3.append("스프링");
		sb3.append("자바다");
		
		System.out.println("문자열길이:"+sb3.length());
		System.out.println("버퍼크기:"+sb3.capacity()); //StringBuffer는 버퍼의 크기가 늘어난다.
		
		int pos = sb3.indexOf("seoul");
		System.out.println(pos);
		
		
		
		
		//insert
		sb3.insert(0,"한국");
		System.out.println(sb3);
		
		sb3.insert(sb3.indexOf("seoul")+"seoul".length(),"사람");
		System.out.println(sb3);
		
		
		
		
		//delete
		sb3.delete(sb3.indexOf("스프링"), sb3.indexOf("스프링")+"스프링".length());
		System.out.println(sb3);
		
		sb3.delete(sb3.indexOf("대한민국"),sb3.length());
		System.out.println(sb3);
		
		
		
		
		//대문자로 변환은 String으로 변환 후
		//소문자 -> 대문자로 변환 
		String a = sb3.toString().toUpperCase();
		System.out.println(a);
	
		
		
		
		
		//문자열과 버퍼의 길이출력
		System.out.println("문자열 길이:"+sb3.length()); //문자열길이:14
		System.out.println("버퍼:"+sb3.capacity());   //버퍼:34
		
		
		
		
		//버퍼의 크기를 문자열길이만큼 줄이기
		sb3.trimToSize();
		System.out.println("버퍼:"+sb3.capacity());
		
	}	
}
