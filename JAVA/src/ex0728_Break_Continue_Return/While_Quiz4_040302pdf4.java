package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class While_Quiz4_040302pdf4 {
	public static void main(String[] args) {		
		//������ �Է� �޾� 0���� �Է� ���� ������ŭ �Ǻ���ġ������ ����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		int N,n,a,b,c;
		System.out.print("���� ? ");
		N=sc.nextInt();
		
		n = 0; a = 0; b = 1;
		
		while(n<N) {
			System.out.print(a+" ");
			c = a+b;
			a = b;
			b = c;
			n++;
		}
		
		sc.close();
	}
}
