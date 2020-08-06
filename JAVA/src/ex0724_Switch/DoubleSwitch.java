package ex0724_Switch;

public class DoubleSwitch {

	public static void main(String[] args) {
		int a;
		a = 12;

		switch (a % 2) {
		case 0:
			switch (a % 3) { //2와 3으로 나누어 떨어졌을때, 실행 
			case 0:
				System.out.println("*"); break; //이중괄호 안에 break는 현재 괄호만을 빠져나감
			case 1:
				System.out.println("#"); break;
			case 2:
				System.out.println("@"); break;
			} break;
		case 1:
			System.out.println("$"); break;
		}
	}

}
