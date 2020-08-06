package ex0730_Array2D;

public class Array_2D_Quiz2 {
	public static void main(String[] args) {

		
		/*
		  20  19  18  17  
		  .
		  .
		   8   7   6   5
		   4   3   2   1
		 */
		
		int[][]a = new int[5][4];
		int n = 0;
		
		
		for(int i = a.length-1; i>=0; i--) 
		{	
			for(int j = a[i].length-1; j>=0; j--) {
				n++;
				a[i][j]=n;
			}
		}
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
		
	}
}
