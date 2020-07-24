package ex0724;

import java.util.Scanner;

public class Switch_Default {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.print("정수?");
		n = sc.nextInt();

		switch (n) {
		case 3:
			System.out.println("***");
			break;
		case 2:
			System.out.println("##");
			break;
		case 1:
			System.out.println("$");
			break;
		default:
			System.out.println("입력오류..");
			break; // 위에 나오는 case조건을 어느거도 사용하지 않았을 때, default --> 꼭 마지막 위치에 있어야하는 건 아님, 위치는 중요하지 않지만 break잘 써서 종료해줘야 함!
		}

		sc.close();
	}
}
