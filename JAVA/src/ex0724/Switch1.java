package ex0724;

public class Switch1 {

	public static void main(String[] args) {
		
		int a;
		
		a = 3;
		
		switch(a) { //괄호안에 수학식 가능  byte, short, char, int, String, enum만 가능	
			case 5: //a는 5니? 
				System.out.print("*"); 
			case 4:
				System.out.print("%");
			case 3:
				System.out.print("$");
			case 2:
				System.out.print("#");
			case 1:
				System.out.print("@");
		}
		// $#@ -> break가 없기 때문에 조건에 맞는 문장 모두 실행
		System.out.println();
		
		
	}

}
