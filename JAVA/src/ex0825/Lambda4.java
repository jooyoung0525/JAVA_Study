package ex0825;

public class Lambda4 {
	public static void main(String[] args) {
		
		//������ ���ڿ���
		User5 u1 = (n)->{return String.valueOf(n);};
		User5 u2 =  (n)->String.valueOf(n);
		User5 u3 = String::valueOf;
		
		System.out.println(u1.convert(10));
		System.out.println(u2.convert(10));
		System.out.println(u3.convert(10));
		
	
		String s = sub(10,u2);
		System.out.println(s);
	}
	
	public static String sub(Integer num, User5 u) {
		return u.convert(num);
	}
}

@FunctionalInterface //���ٰ� �������� �ʴ� ��� ����
interface User5{
	public String convert(Integer n);
}

