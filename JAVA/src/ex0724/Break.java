package ex0724;

public class Break {
	public static void main(String[] args) {
		
		int a;
		a = 5;
		
		switch(a) { //��ȣ�ȿ� ���н� ����  byte, short, char, int, String, enum�� ����	
			case 5: //a�� 5��? 
				System.out.print("*****");
				break; // switch~case, while, do~while, for���� ����������.
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
