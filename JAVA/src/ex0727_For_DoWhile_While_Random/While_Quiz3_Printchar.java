package ex0727_For_DoWhile_While_Random;

public class While_Quiz3_Printchar {
	public static void main(String[] args) {
		
		char ch = 'A';
		int s = 0;
		
		while(ch <= 'Z') {
			s++;
			System.out.printf("%c ",ch);
			if(s%7==0)
				System.out.println();
			ch++;
		}
	}
}
