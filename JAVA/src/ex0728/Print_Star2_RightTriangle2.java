package ex0728;

public class Print_Star2_RightTriangle2 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=5-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
