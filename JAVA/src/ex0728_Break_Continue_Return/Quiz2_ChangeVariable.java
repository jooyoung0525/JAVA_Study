package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class Quiz2_ChangeVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.print("정수 ? ");
		num = sc.nextInt();
		String result = "";
		
		while(num/16 > 0) {
			
			if(num % 16 == 10) System.out.print('A');
			else if(num % 16 == 11) System.out.print('A');
			else if(num % 16 == 12) result += 'C';
			else if(num % 16 == 13) result += 'D';
			else if(num % 16 == 14) result += 'E';
			else if(num % 16 == 15) result += 'F';
			else  result += (num % 16);
			
			num /= 16;
		}
		
		System.out.println("결과 : "+result);
		sc.close();
	}
}
