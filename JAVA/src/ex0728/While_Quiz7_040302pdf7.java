package ex0728;

import java.util.Scanner;

public class While_Quiz7_040302pdf7 {
	public static void main(String[] args) {
		//양의 정수를 입력 받아 입력 받은 정수를 뒤집어 출력하는 프로그램을 작성하시오.
		int num;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("수 ? ");
			num=sc.nextInt();
		}while(num<0);
		 
		System.out.println("원래의 수 : "+num);
		
		System.out.print("뒤집은 수 : ");
		while(true) {
			System.out.printf("%d",num%10);
			num/=10;
			if(num <= 0)break;
		}
		
		sc.close();
	}
}
