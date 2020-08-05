package ex0805;

public class API_StringBuffer_CompareTime {
	public static void stringTime() {
		System.out.println("String...");
		
		long start = System.currentTimeMillis();
		String s = "a";
		for(int i = 0; i<100000; i++) {
			s+="a"; //가변적인 문자열
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("문자열의길이 :"+s.length()); //문자열의길이 :100001
		System.out.println("실행시간 :"+(end-start)+"ms"); //실행시간 :2120ms
	}
	
	
	
	public static void stringBufferTime() {
		System.out.println("StringBuffer...");
		
		long start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("a");
		for(int i = 0; i<100000; i++) {
			sb.append("a"); //가변적인 문자열
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("문자열의길이 :"+sb.length()); //문자열의길이 :100001
		System.out.println("실행시간 :"+(end-start)+"ms"); //실행시간 :3ms
	}
	
	
	
	public static void main(String[] args) {
		stringTime();
		stringBufferTime();
	}

}
