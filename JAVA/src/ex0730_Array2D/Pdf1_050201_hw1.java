package ex0730_Array2D;

public class Pdf1_050201_hw1 {
	public static void main(String[] args) {
		
		int arr[][] =new int[5][5];
		
		int cnt = 0;
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				cnt++;
				
				if(i%2 == 0) 
					arr[i][j]=cnt;
				else 
					arr[i][4-j]=cnt;
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
