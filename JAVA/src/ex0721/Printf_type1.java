package ex0721;

public class Printf_type1 {

	public static void main(String[] args) {
		
		// %d: 정수 출력
		System.out.printf("%d",400);
		System.out.println();
		System.out.printf("%d\n",-400);
			
		/*	 
		 <오류의 종류>
		 1. 컴파일 오류 : 문법 오류 
		 2. 런타임 오류 : 실행하다 발생하여 프로그램이 종료가 되는 오류 
		*/
		
		
		// % : 나머지를 구하는 연산자
		//System.out.printf("%d % %d = %d\n",13,5,13%5); //런타임 오류  
		
		
		System.out.printf("%d %% %d = %d\n",13,5,13%5); // %출력하고 싶으면  %를 연달아 두번 작성
		
		//System.out.printf("%d", 'A');  //런타임 오류 . %d는 문자 출력 불가
		//해결방법 1)
		int a = 'A';
		System.out.printf("%d\n",a);
		//해결방법 2)
		System.out.printf("%d\n",(int)'B');
		
		
		//System.out.printf("%d\n",22000000000); --> 컴파일오류
		System.out.printf("%d\n",22000000000L);
		
		
		System.out.println("0123456789");
		System.out.printf("%5d\n",12);  //%숫자d: 숫자만큼 자리 수 출력. 공백 앞에 생김
		System.out.printf("%05d\n",12); //%0숫자d: 남는공백 0으로 채움
		System.out.printf("%-5d\n",12); //%-숫자d: 공백이 뒤에 생김
		System.out.printf("%2d\n",12345); //정수는 자리수가 부족하면 자리수를 무시.
		
		System.out.printf("%d\n",12);
		System.out.printf("%d\n",-12);
		
		System.out.printf("%+d\n",12); //양수 앞에 +기호 출력
		System.out.printf("%+d\n",-12);
		
		System.out.printf("%(d\n",12);
		System.out.printf("%(d\n",-12); //음수를 괄호로 표현
		
		System.out.printf("%(d\n",12345);
		System.out.printf("%,d\n",12345); //세자리마다 ,출력
	}

}