package ex0730;

public class Pdf3_050201_hw3 {
	public static void main(String[] args) {
		
		int arr[][] =new int[4][5];
		
		int cnt = 0;
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<4; j++) {
				cnt++;
				if(i%2 == 0)
					arr[j][i]=cnt;
				else
					arr[3-j][i]=cnt;
			}
		}
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<5; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
