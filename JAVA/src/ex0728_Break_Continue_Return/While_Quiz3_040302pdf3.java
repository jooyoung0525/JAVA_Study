package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class While_Quiz3_040302pdf3 {
	public static void main(String[] args) {
		//두 정수를 입력 받아 입력 받은 정수의 최대공약수 및 최소공배수를 구하는 프로그램을 작성하시오.
		
		
		//arlt+shift+r ==> 변수이름 한번에 바꿈
		
		/*
		 * <<최대공약수 gcd >>
		 * 두 수 a,b에 대해서 a를 b로 나눈 나머지를 r이라 하면(a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
		 * 이 성질에 따라, b를 r로 나눈 나머지를 r'로 구하고, 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여
		 *나머지가 0이 되었을 때, 나누는 수가 a와 b의 최대공약수이다.
		 *
		 *
		 * <<최소공배수 lcm >>
		 * 두 수 a,b --> a*b/gcd
		 */
		
		
		Scanner sc = new Scanner(System.in);
		 
		int num1,num2,temp;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		temp = 0;
		if(num2<num1) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int n1 = num1;
		int n2 = num2;
		
		int gcd = 0;
		int lcm = 0;
		
		while(true) {
			
			if(n2%n1 == 0) break;
			gcd = n2%n1;
			n2 = n1;
			n1 = gcd;
		}
		
		lcm = (num1*num2)/gcd;
		
		System.out.println("최대공약수 : "+gcd);
		System.out.println("최소공배수 : "+lcm);
		
		
		sc.close();
	}
}
