package ex0722_Operator;

import java.util.Scanner;

public class Quiz5_Money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("금액 ?");
		a = sc.nextInt();
		
		System.out.println("5만원권: "+(a/50000));
		System.out.println("만원권: "+ ((a%50000)/10000));
		System.out.println("오천원권: "+ ((a%10000)/5000));
		System.out.println("천원권: "+ ((a%5000)/1000));
		System.out.println("오백원권: "+ ((a%1000)/500));
		System.out.println("백원권: "+ ((a%500)/100));
		System.out.println("오십원권: "+ ((a%100)/50));
		System.out.println("십원권: "+ ((a%50)/10));
		System.out.println("오원권: "+ ((a%10)/5));
		System.out.println("일원권: "+ ((a%5)/1));
		sc.close();
	}
}
