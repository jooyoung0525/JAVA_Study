package ex0721_Scanner;

public class Printf {
	public static void main(String[] args) {
		int a = 10, b = 5;
		int c = a+b;
		
		System.out.println(a+"+"+b+"="+c);
		
		System.out.printf("%d + %d = %d\n",a,b,c); 
		// printf ==> 서식에 맞춰 내용을 출력할 때 사용
		// System.out.prinf("서식",값);
		// %d : 정수 변환문자
		
		System.out.format("%d + %d = %d \n",a,b,c); // printf == format
	}
}
