package ex0727;

public class while_ex1 {
	public static void main(String[] args) {
		int n,m;
		
		n = 0;
		m = 0;
		
		while(n<3) {
			n++;
			//m = 0;
			while(m<2) {
				m++;
				System.out.println(n+","+m);
			}
			System.out.println("**********");
		}
	}
}
