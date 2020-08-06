package ex0727_For_DoWhile_While_Random;

public class For_ex1 {
	public static void main(String[] args) {

		/* <<for문의 동작>>
		int a;
		for(a = 1; a<=5; a++) { //a=1 먼저 실행, 1<=5 조건만족 (1) // a++ --> 2 (3) // a++ --> 6 -->for문 밖으로 나감
			System.out.println("안 : "+a); // 안 : 1 출력 (2) // 2..3..4..5 출력
		}
		System.out.println("밖 : "+a); //6
		*/
		
		/*
		int a;
		for(a = 1; a<=5; a+=2) { 
			System.out.println("안 : "+a); 
		}
		System.out.println("밖 : "+a);
		
		//1. a = 1 실행
		//2. 1<=5 조건만족
		//3. 1 출력
		//4. a+=2 --> a = 3
		//5. 3<=5 조건만족
		//6. 3 출력
		//7. a+=2 --> a = 5
		//8. 5<=5 조건만족
		//9. 5출력
		//10.a+=2 --> 7
		//11.7<=5 조건불만족
		//12.for문빠져나감
		 * 
		 */
		
		/*
		int a = 1;
		for(; a<=5;) { //이런식으로 for문 쓸바에 while문장!

			System.out.println("안 : "+a);
			a++;
		}
		System.out.println("밖 : "+a); 
		*/
		
		
		/*
		//(컴파일 오류 문장)
		int a;
		for(a = 1; ;a++) { //조건이 없으면 무한 루프!!!!

			System.out.println("안 : "+a);
		}
		System.out.println("밖 : "+a); 
		*/
		
		
		/* 이렇게 할바에 while씀!
		int a;
		for(a = 1; ;a++) { 

			System.out.println("안 : "+a);
			if(a>=5) break;
		}
		System.out.println("밖 : "+a); 
		*/
	}
}
