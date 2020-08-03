package ex0730;

public class Pdf6_050201_hw6 {
	public static void main(String[] args) {
		
		char arr[][] = new char[4][4];
		char comp[] = new char[16];
		int idx = 0;
		char com;
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				
				com = (char)((Math.random()*26)+'A');
				boolean flag = false;
				
				for(int k = 0; k<i*j; k++) {
					if(com == arr[i][j]) { 
						flag = true;
						break;
						}
					}
				
				
				if(flag) {
					j--;
					if(j<0) {
						j=3; i--;
						break;
					}
					break;
				}
				
				arr[i][j] = com;
				comp[idx] = com;
			  }
		}
	
		
		
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				System.out.printf("%c\t",arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
