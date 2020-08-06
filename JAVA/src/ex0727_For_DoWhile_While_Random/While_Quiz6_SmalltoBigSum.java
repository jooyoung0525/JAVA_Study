package ex0727_For_DoWhile_While_Random;

import java.util.Scanner;

public class While_Quiz6_SmalltoBigSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1,n2,hap,temp,s;
		System.out.println("두수 ?");
		n1= sc.nextInt();
		n2 = sc.nextInt();
		
		if(n2<n1)
		{
			temp = n2;
			n2 = n1;
			n1 = temp;
		}
		
		hap = 0;
		s = n1;
		while(s <= n2) {
			hap+=s;
			s++;
		}
		
		System.out.println(n1+" ~ "+ n2 + "까지의 합 = "+hap);
		
		sc.close();
	}
}
