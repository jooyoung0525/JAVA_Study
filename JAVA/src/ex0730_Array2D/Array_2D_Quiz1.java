package ex0730_Array2D;

public class Array_2D_Quiz1 {
	public static void main(String[] args) {

		
		/*
		 *  1  2  3  4
		 *  8  7  6  5 
		 *  9 10 11 12
		 * 16 15 14 13
		 * 17 18 19 20
		 */
		int[][]a = new int[5][4];
		int n = 0;
		
		/*
		//³»°¡Ç¬°Å
		for(int i = 0; i<a.length; i++) 
		{	
			if(i % 2 == 0) {
				for(int j = 0; j<a[i].length; j++) {
					n++;
					a[i][j]=n;
				}	
			}
			else 
			{
				for(int j = a[i].length-1; j>=0; j--) {
					n++;
					a[i][j] = n;
				}	
				
			}
		}
		
		
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
		*/
		
		
		
		
		
		
		for(int i = 0; i<a.length; i++) 
		{	
			for(int j = 0; j<a[i].length; j++) {
				n++;
				if(i%2==0)a[i][j]=n;
				else a[i][(a[i].length-1)-j]=n;
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
