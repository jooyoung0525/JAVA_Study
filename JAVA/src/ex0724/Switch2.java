package ex0724;

public class Switch2 {
	public static void main(String[] args) {

		int a;

		a = 13;
		switch (a % 3) {
		case 0:
			System.out.println(a + " :3�ǹ��");
			break;
		case 1: 
		case 2:
			System.out.println(a + ":3�ǹ���� �ƴ�"); // ������ ������ break�Ƚᵵ��
		}
	}
}
