package ex0731;

public class Method_Ex1 {
	public static void main(String[] args) {
      
		int a;
		User4 u = new User4();
		
		a = u.sum(5);
		System.out.println(a);
		
		a = u.sum(10);
		System.out.println(a);
	}
}


class User4{
	public int sum(int n) {
		int s = 0;
		for(int i = 1; i<=n; i++) {
			s+=i;
		}
		return s;
	}
}