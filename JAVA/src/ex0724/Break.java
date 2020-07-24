package ex0724;

public class Break {
	public static void main(String[] args) {
		
		int a;
		a = 5;
		
		switch(a) { //괄호안에 수학식 가능  byte, short, char, int, String, enum만 가능	
			case 5: //a는 5니? 
				System.out.print("*****");
				break; // switch~case, while, do~while, for문을 빠져나간다.
			case 4:
				System.out.print("%%%%");
				break;
			case 3:
				System.out.print("$$$");
				break;
			case 2:
				System.out.print("##");
				break;
			case 1:
				System.out.print("@");
				break;
		}
		
		System.out.println();

	}
}
