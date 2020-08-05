package ex0804;

public class Recursion_Ex2 {
	public static void main(String[] args) {
		
		User6 uu = new User6();
		uu.print(5);
	}
}


class User6{
	
	public void print(int n) {
		System.out.println("start:"+n);	// 3 2
		
		if(n>1) {
			print(n-1); 
			print(n-1);
		}
		
		System.out.println("end:"+n); // 1
	}
	
}