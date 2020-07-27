package ex0727;

public class DoWhile_ex1 {
	public static void main(String[] args) {
		
		int n;
		n = 5;
		
		do { //어떠한 경우라도 적어도 한번은 실해한다.
			n++;// --> 6
			System.out.println("안:"+n); //안:6
		}while(n<5); //조건불만족	
		System.out.println("밖:"+n); //밖:6
	}
}
