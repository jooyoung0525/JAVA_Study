package ex0727_For_DoWhile_While_Random;

public class While_ex2 {
	public static void main(String[] args) {
		int n, m;
		n = 0;
		while(n<9) {
			n++;
			System.out.println("**"+n+"´Ü **");
			m = 0;
			while(m<9) {
				m++;
				System.out.printf("%d * %d = %d\n",n,m,n*m);
			}
			System.out.println("------------------------------");
		}
	}
}
