package ex0805_String_StringBuffer_StringBuilder_API;

public class API_String_Quiz2 {
	public static void main(String[] args) {

		/*
		 * 1~100���� ���ڸ� ���ٿ� 10���� ���, 3,6,9�϶��� * ���
		 */

		String s;
		for (int i = 1; i <= 100; i++) {
			s = Integer.toString(i);
			s = s.replaceAll("(3|6|9)", "*");

			if (s.indexOf("*") != -1) {
				s = s.replaceAll("\\d", "");
			}
			System.out.print(s + "\t");

			if (i % 10 == 0)
				System.out.println();
		}
	}
}
