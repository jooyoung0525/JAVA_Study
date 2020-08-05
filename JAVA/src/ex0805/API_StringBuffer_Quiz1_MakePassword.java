package ex0805;

public class API_StringBuffer_Quiz1_MakePassword {
	public static void main(String[] args) {
		
		//<<임시 패스워드 생성>>
		
		// 영문자숫자특수문자를 조합하여 10개의 문자열을
		// 반환하는 메소드 만들기
		// 단, 호출할때마다 다른 반환
		
		String s = generatePwd(); //generatePwd는 클래스메소드라 인스턴스생성안해도됨
		System.out.println(s);
		
	}
	
	public static String generatePwd() {
		StringBuilder sb = new StringBuilder(); //가변문자에 용이
		
		String s ="!@#$%^&*()-+/ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		//이중에서 10개 추출
		
		int n;
		
		//(int)(Math.random()*10) => 0~9
		for(int i = 0; i<10; i++) {
			n = (int)(Math.random()*s.length()); //-1안해줘도됨
			sb.append(s.substring(n,n+1));
		}
		
		return sb.toString();
	}
}
