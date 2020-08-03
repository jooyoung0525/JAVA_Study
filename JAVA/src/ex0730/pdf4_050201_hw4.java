package ex0730;

public class Pdf4_050201_hw4 {
	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		
		int cnt = 0;
		
		for(int i = 0; i<5; i++) {
			for(int j = i; j<5; j++) {
				cnt++;
				arr[i][j]=cnt;
			}
		}
		
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
			
				if(arr[i][j]==0) {
					System.out.print("   ");
				}
				else
					System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
