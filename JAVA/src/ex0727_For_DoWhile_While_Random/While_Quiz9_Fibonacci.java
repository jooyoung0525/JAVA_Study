package ex0727_For_DoWhile_While_Random;

public class While_Quiz9_Fibonacci {
	public static void main(String[] args) {
		
		/* <<�� Ǯ��>> 
		 * int num,s1,s2,hap;
		 * 
		 * hap = s1 = 0; num = s2 = 1;
		 * 
		 * while(num<=21) {
		 * 
		 * 	hap += num; 
		 *  num += s1; 
		 *  s1 = s2; 
		 *  s2 = num; 
		 * }
		 * 
		 * System.out.println(hap);
		 */

		
		
		// ������ Ǯ��
		int a = 0, b = 1, c = 1;

		int n = 0, s = 0;

		while (n < 8) {
			s += c;

			// System.out.println(c); // �Ǻ���ġ ���� ���
			c = a + b;

			n++;

			a = b;
			b = c;
		}
		System.out.println(s);

	}
}
