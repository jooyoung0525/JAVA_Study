package ex0728_Break_Continue_Return;

import java.util.Scanner;

public class While_Quiz3_040302pdf3 {
	public static void main(String[] args) {
		//�� ������ �Է� �޾� �Է� ���� ������ �ִ����� �� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		
		//arlt+shift+r ==> �����̸� �ѹ��� �ٲ�
		
		/*
		 * <<�ִ����� gcd >>
		 * �� �� a,b�� ���ؼ� a�� b�� ���� �������� r�̶� �ϸ�(a>b), a�� b�� �ִ������� b�� r�� �ִ������� ����.
		 * �� ������ ����, b�� r�� ���� �������� r'�� ���ϰ�, �ٽ� r�� r'�� ���� �������� ���ϴ� ������ �ݺ��Ͽ�
		 *�������� 0�� �Ǿ��� ��, ������ ���� a�� b�� �ִ������̴�.
		 *
		 *
		 * <<�ּҰ���� lcm >>
		 * �� �� a,b --> a*b/gcd
		 */
		
		
		Scanner sc = new Scanner(System.in);
		 
		int num1,num2,temp;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		temp = 0;
		if(num2<num1) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		int n1 = num1;
		int n2 = num2;
		
		int gcd = 0;
		int lcm = 0;
		
		while(true) {
			
			if(n2%n1 == 0) break;
			gcd = n2%n1;
			n2 = n1;
			n1 = gcd;
		}
		
		lcm = (num1*num2)/gcd;
		
		System.out.println("�ִ����� : "+gcd);
		System.out.println("�ּҰ���� : "+lcm);
		
		
		sc.close();
	}
}
