package ex0721;

public class Letter_Literal {

	public static void main(String[] args) {
		String s = "Korea";
		System.out.println(s); //Korea
		
		//s='A'; ������ ����

		s="\"Korea";
		System.out.println(s); // "Korea
		
		s="\\Korea";
		System.out.println(s); // \Korea
				
		s="\"Korea\"";
		System.out.println(s); // "Korea"
		
		s="K\to\trea";
		System.out.println(s); // K	o	rea
		
		s="K\ro\nea";
		System.out.println(s); //  K
		                       //  o
		                       //  ea
		
		s="K\borea";
		System.out.println(s); // c������ \b�� �齺���̽� ����. �ڹٿ��� ������.
	}

}