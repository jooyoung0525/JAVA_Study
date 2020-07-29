package ex0727;

public class For_ex2 {
	public static void main(String[] args) {
		
		/*
		int n,s;
		s = 0;
		
		for(n = 1; n<=10; n++) //n=11이되고 조건에 만족하지 못해 for문을 빠져나옴!
			s+=n;
		
		System.out.println(n+","+s);*/
		
		
		/*
		<<짝수 합>>
	
				int n,s;
		s = 0;
		
		for(n = 1; n<=10; n+=2) 
			s+=n;
		
		System.out.println(n+","+s);*/
		
		
		
		int n,s;
		for(n = 1, s = 0; n <=10; s+=n, n++) //이렇게 짜도 되지만 헷갈리는 부분이 많기 때문에 권장하지 않음
			;
		
		System.out.println(n+","+s);
		
		
	}
}
