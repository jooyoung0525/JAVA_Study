package ex0724_Switch;

public class DoubleSwitch {

	public static void main(String[] args) {
		int a;
		a = 12;

		switch (a % 2) {
		case 0:
			switch (a % 3) { //2�� 3���� ������ ����������, ���� 
			case 0:
				System.out.println("*"); break; //���߰�ȣ �ȿ� break�� ���� ��ȣ���� ��������
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
