package ex0721_Scanner;

public class Printf_type2 {
	public static void main(String[] args) {
		
		//16진수로 출력:h
		System.out.printf("%h %h\n", 15, 3456);
		
		//bool형
		System.out.printf("%b\n", true);
		
		//소숫점
		System.out.printf("%f\n",123.23); //123.230000
		System.out.printf("%.2f\n",123.1569); //123.16 (알아서 반올림) --> .숫자f : 소숫점 아래 숫자만큼 출력
		System.out.printf("%10.2f\n",123.1569); //    123.16 --> 전체 10자리 출력, 소숫점아래 2자리 출력
		
		//정수자리는 자리수가 부족하면 무시
		System.out.printf("%4.2f\n",123.1569); //123.16 --> 전체 4자리 출력, 소숫점아래 2자리 출력 
		System.out.printf("%f\n",12345.0e-03); // 12.345000
		
		System.out.printf("%g\n",123.15); //123.150
		
		//소숫점 3자리 넘어가지 않음 : g
		System.out.printf("%g\n",123.158556);//123.159
		
		System.out.printf("%10.5g\n",123.158556);//    123.16 //10.5g -> 10자리로 출력하고,유효자리수(진짜 숫자출력하는자리)는 5자리 
		System.out.printf("%10.3g\n",123.158556);//       123 //10.3g -> 10자리로 출력하고,유효자리수(진짜 숫자출력하는자리)는 3자리 
		
		System.out.printf("%10.2g\n",123.158556);//   1.2e+02 //10.2g -> 10자리로 출력하고,유효자리수(진짜 숫자출력하는자리)는 2자리 
		//1.2315 * 10의 2승 => 1.2315e+02
		//1.2e+02
		
		
		//내용을 지수형태로 출력 : e  
		//지수는 0이 아닌 수로 첫 글자 시작
		System.out.printf("%e\n",123.158556);//1.231586e+02
		System.out.printf("%10e\n",123.158556);// 1.232e+02
		
		//16진수로 출력
		// 13(10진수): d(16진수)
		System.out.printf("%h\n",13);
		System.out.printf("%x\n",13);
		System.out.printf("%X\n",13);
		
		//8진수
		System.out.printf("%o\n",13); //13(10진수) -> 15(8진수)
		
		//한문자 출력
		System.out.printf("%c\n",'A'); //A
		System.out.printf("%c %C\n",'a','a'); //a A
		System.out.printf("%c\n",65); //A
		
		//문자열 출력
		System.out.printf("%s\n","korea"); //korea
		System.out.printf("%S\n","Korea"); //KOREA
		
		System.out.printf("%10s\n","korea"); //     korea
		System.out.printf("%10.3s\n","korea"); //       kor
		
		
		int a = 10, b = 5;
		System.out.printf("%d %d %d %d\n", a,a,b,a);
		System.out.printf("%1$d %1$d %2$d %1$d\n", a,b); //1$:첫번째 값 ->a , 2$:두번째 값 ->b
		
		System.out.printf("%(,.2f\n",1235.12345); //1,235.12 --> ,3자리마다 콤마 찍어줌
		System.out.printf("%(,.2f\n",-1235.12345); //(1,235.12) -->괄호는 음수일때 괄호!		
	}
}