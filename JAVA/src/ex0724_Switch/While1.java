package ex0724_Switch;

public class While1 {

	public static void main(String[] args) {
		
		/* 
		int n;
		while(n<10) { //컴파일 오류. -> n이 초기화 안됨
			n++;
			System.out.println(n);
		}
		*/
		
		
		/*
		  int n; n=0; //초기화 필요 
		  while(n<10) { 
		 	n++; 
			System.out.println(n+" "); //1~10까지의 자연수 
		  } 
		  System.out.println("\n밖:"+n); //결과 값
		 */	
		
		
		/*
		int n = 0; //선언과 동시에 초기화
		while(n++<10) //비교하고 증가
		{
			//10번 반복
			System.out.print(n+" ");
		}
		System.out.println("\n밖:"+n); // 11
		*/
		
		
		/*
		int n = 0; //선언과 동시에 초기화
		while(++n<10) //먼저 1을 증가하고 비교
		{
			//9번 반복
			System.out.print(n+" ");
		}
		System.out.println("\n밖:"+n); // 10
		*/
		
		
		/*
		int n = 0; //선언과 동시에 초기화
		while(++n<=10) //먼저 1을 증가하고 비교
		{
			//9번 반복
			System.out.print(n+" ");
		}
		System.out.println("\n밖:"+n); // 11
		*/
		
		
		int n = 0;
		while(n<10) {
			n+=2;
			System.out.println(n+" "); // 2 4 6 8 10
		}
		System.out.println("\n밖:"+n); //10
		
	}
}
