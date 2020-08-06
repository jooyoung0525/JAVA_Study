package ex0805_String_StringBuffer_StringBuilder_API;

public class API_String {
	public static void main(String[] args) {
		
		// 자바에서는 문자열도 객체이다.
		// 문자열 비교는 == 절대쓰지말것!!! -> 주소비교하기 때문!!!
		
		// 같은 문자열을 입력받으면 같은 주소를 할당받음!! -> 자바가 할당할때 문자열이 같은지 확인하고 문자열이 같으면 
		//                                     같은 주소 할당, 문자열이 다르면 다른 주소 할당.
		
			String s1 = "seoul"; //s1에는 주소가 저장 -> 오버라이딩으로 문자열출력하게 재정의
			String s2 = "seoul"; //메모리할당을 한번만함 -> s1,s2 같은 주소 공유
			
			String s3 = new String("seoul"); //new만나서 객체 생성 -> 주소가 바뀜
			
			System.out.println(s1+":"+s2+":"+s3);
			
			//문자열에서의 == : 주소 비교
			System.out.println(s1==s2); //true
			System.out.println(s1==s3); //false
			
			//String에서의 equals() : 값을 비교 --> 오버라이딩 
			//Object의 equals()와 다름!
			System.out.println(s1.equals(s2)); //true
			System.out.println(s1.equals(s3)); //true
			
			System.out.println(s1.hashCode()); //109324212
			System.out.println(s2.hashCode()); //109324212
			System.out.println(s3.hashCode()); //109324212
			
			
			
			
			
			//<<불변의 법칙! 절대로 스트링의 값을 바꿀 수 없음>>
			
			s1+="Korea"; // 절대로 이 연산을 여러번 반복하면 안됨!
						 // 기존의 s1: seoul 주소를 가진 문자열이 변하는게 아니라
                         // 다른 문자가 추가되면 다시영역의 메모리를 할당받아서 주소가 변함!
			             // 기존 주소의 문자열을 바꿀 수 없다!!!!
			
			System.out.println(s1); //seoulKorea
			System.out.println(s2); //seoul
			System.out.println(s1==s2); //false
			
			
	}
}
