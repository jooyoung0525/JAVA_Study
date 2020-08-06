package ex0724_Switch;


public class While_Practice5 {

	public static void main(String[] args) {
		char a;
		int cnt = 0;
		
		a = 'A';
		
		while(a<='Z') {

			System.out.print(a+"\t");
			a++;
			cnt++;
			
			if(cnt % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println();
	
	}

}
