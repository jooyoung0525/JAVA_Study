package ex0724;

public class Switch1 {

	public static void main(String[] args) {
		
		int a;
		
		a = 3;
		
		switch(a) { //��ȣ�ȿ� ���н� ����  byte, short, char, int, String, enum�� ����	
			case 5: //a�� 5��? 
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
		// $#@ -> break�� ���� ������ ���ǿ� �´� ���� ��� ����
		System.out.println();
		
		
	}

}
