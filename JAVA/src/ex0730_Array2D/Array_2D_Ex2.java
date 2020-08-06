package ex0730_Array2D;

public class Array_2D_Ex2 {
	public static void main(String[] args) {

		int[][]a = new int[5][4];
		int[][]b = new int[5][4];
		int n = 0;
		
		
		
		/*
		 *  1  2  3  4
		 *  5  6  7  8 
		 *  9 10 11 12
		 * 13 14 15 16
		 * 17 18 19 20
		 */
		for(int i = 0; i<a.length; i++) {
			
			for(int j = 0; j<a[i].length; j++) {
				n++;
				//System.out.println(i+":"+j+":"+n);
				a[i][j]=n;
			}
		}
		
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.printf("%4d",a[i][j]);	
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
		
		
		
		/*
		 * 1  6 11 16
		 * 2  7 12 17 
		 * 3  8 13 18
		 * 4  9 14 19
		 * 5 10 15 20
		 */
		n = 0;
		for(int i = 0; i<b[i].length; i++) {
			
			for(int j = 0; j<b.length; j++) {
				n++;
				//System.out.println(i+":"+j+":"+n);
				b[j][i]=n;
			}
		}
		
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++) {
				System.out.printf("%4d",b[i][j]);	
			}
			System.out.println();
		}
		System.out.println();
	}
}
