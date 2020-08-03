package ex0730;

public class Pdf2_050201_hw2 {
	public static void main(String[] args) {
		
		char arr[][] =new char[5][5];
		
		char cnt = 'A';
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				arr[4-j][i]=cnt;
				cnt++;
			}
		}
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.printf("%3c",arr[i][j]);
			}
			System.out.println();
		}
	}
}
