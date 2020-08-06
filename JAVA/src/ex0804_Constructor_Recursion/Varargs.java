package ex0804_Constructor_Recursion;

public class Varargs {
	public static void main(String[] args) {
		User10 u = new User10();
		int s;
		s = u.sum(1,3,5,7,9);
		System.out.println(s);
		
		
		s = u.sum(1,2,3);
		System.out.println(s);
	}
}


class User10{
	public int sum(int ...args) {
		int s = 0;
		
		for(int n : args) {
			s+=n;
		}
		
		//����������(��3�� ...) ==> ������ ������ �������� ���� 
		//                  ==> �ڹٴ� ���������� �迭�� ���ļ� ó��
/*
  		for(int i = 0; i<args.length; i++){
  			s+=args[i];
  		}
 */		
		
		return s;
	}
}