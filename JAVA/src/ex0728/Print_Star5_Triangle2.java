package ex0728;

public class Print_Star5_Triangle2 {

	public static void main(String[] args) {
		
		int s = 9;
		for(int i= s/2+1; i<=s; i++) {
			for(int j = 0; j<i; j++)
			{
				System.out.print((s-i)<=j?"*":" ");
			}
			System.out.println();
		}
	}
}
