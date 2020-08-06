package ex0730_Array2D;

public class Pdf5_050201_hw5 {
	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		
		int cnt = 0;
		
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<5; j++) {
				
				int k = i-j;
				if(k>=0 && k<5)
				{
					cnt++;
					arr[j][k]=cnt;
				}
			}
		}
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
