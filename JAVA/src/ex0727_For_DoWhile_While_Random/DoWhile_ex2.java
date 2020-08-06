package ex0727_For_DoWhile_While_Random;

public class DoWhile_ex2 {
	public static void main(String[] args) {
		
		 	/*
			int n,s;
			n = s = 0;
			while(n<10) {
				n++;
				s+=n;
			}
			System.out.println("결과: " +s);
			*/
		
		 	//위에 결과와 같은 코드를  do~while로
			int n, s;
			n = s = 0;
			do {
				n++;
				s+=n;
			}while(n<10);
			System.out.println("결과:"+s);
			
			//삼항연산자 이용
			s += (n%2==1?n:-n);
			
	}
}
