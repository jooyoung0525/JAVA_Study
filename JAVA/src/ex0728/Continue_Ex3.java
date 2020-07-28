package ex0728;



public class Continue_Ex3 {
	public static void main(String[] args) {
	
		/*
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				if(i+j==4)continue;
				System.out.println("i:"+i+",j:"+j);
			}
		}	*/
		
		ga:
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				if(i+j==4)continue ga;
				System.out.println("i:"+i+",j:"+j);
			}
		}
	}
}
