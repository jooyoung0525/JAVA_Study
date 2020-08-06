package ex0804_Constructor_Recursion;

public class Recursion_Ex1 {
	public static void main(String[] args) {
		
		User7 uu = new User7();
		int s = uu.sum(10);
		System.out.println(s);
	}
}


class User7{
	
	public int sum(int n) {
		return n>1?n+sum(n-1):1;
	}
	
}