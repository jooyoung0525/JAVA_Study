package ex0730_Array2D;

public class Array_2D_Quiz3 {
	public static void main(String[] args) {

		
		//5*4행렬을 4*5행열로 변환
		
		int[][]a = new int[5][4];
		int[][]b = new int[4][5];
		
		for(int i = 0; i<a.length; i++) 
		{	
			for(int j = 0; j<a[i].length; j++) {
				int com = (int)(Math.random() * 100)+1;
				a[i][j] = com;
			}
		}
		
		System.out.println("5*4행렬...");
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i = 0; i<4; i++) 
		{	
			for(int j = 0; j<5; j++) {
				b[i][j] = a[j][j];
			}
		}
		
		System.out.println("4*5행렬...");
		for(int i = 0; i<b.length; i++) {
			for(int j = 0; j<b[i].length; j++) {
				System.out.printf("%4d",b[i][j]);
			}
			System.out.println();
		}
	}
}
