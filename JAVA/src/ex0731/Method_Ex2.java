package ex0731;

public class Method_Ex2 {
	public static void main(String[] args) {
      
		char a = 'a';
		User5 u = new User5();
		
		a = u.upper(a);
		System.out.println(a);
		
	}
}


//���ڸ� �Ű������� �Ѱܹ޾� �ҹ����̸� �빮�ڷ� ��ȯ
class User5{
	public char upper(char ch) {
		return ch >= 'a'&& ch <='z'?(char)(ch-32):(char)ch;
	}
}