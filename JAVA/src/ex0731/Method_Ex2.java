package ex0731;

public class Method_Ex2 {
	public static void main(String[] args) {
      
		char a = 'a';
		User5 u = new User5();
		
		a = u.upper(a);
		System.out.println(a);
		
	}
}


//문자를 매개변수로 넘겨받아 소문자이면 대문자로 변환
class User5{
	public char upper(char ch) {
		return ch >= 'a'&& ch <='z'?(char)(ch-32):(char)ch;
	}
}