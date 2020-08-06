package ex0727_For_DoWhile_While_Random;

public class For_ex5 {
	public static void main(String[] args) {
		
		int cnt = 0; 
		for(char a = 'Z'; a >= 'A'; a--) {
			System.out.print(a+"\t");
			cnt++;
			if(cnt %5 == 0) 
				System.out.println();
		}
	}
}
