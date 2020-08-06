package ex0728_Break_Continue_Return;

public class Print_Star3_InvertedRightTriangle {

	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {
			
			for(int j =0; j<5; j++)
			{
				System.out.print(i<=j?"*":" ");	
			}
			System.out.println();
		}
	}

}
