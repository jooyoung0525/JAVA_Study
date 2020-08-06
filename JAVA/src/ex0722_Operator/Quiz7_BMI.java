package ex0722_Operator;

import java.util.Scanner;

public class Quiz7_BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kg, cm, m;
		double bmi;
		
		System.out.print("Ã¼Áß (Kg) ?");
		kg = sc.nextDouble();
		
		System.out.print("Å° (cm) ?");
		cm = sc.nextDouble();
		
		m = cm/100;
		bmi = kg / (m*m);
		System.out.println("BMI:"+bmi);
		
		sc.close();
	}
}
