package ex0724;

public class Switch2 {
	public static void main(String[] args) {

		int a;

		a = 13;
		switch (a % 3) {
		case 0:
			System.out.println(a + " :3의배수");
			break;
		case 1: 
		case 2:
			System.out.println(a + ":3의배수가 아님"); // 마지막 문장은 break안써도됨
		}
	}
}
