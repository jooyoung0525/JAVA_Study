package ex0727;

import java.util.Scanner;

public class While_Quiz1_Sum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, hap1, hap2, hap3, s;
		System.out.println("�� ?");
		num = sc.nextInt();
		
		hap1 = hap2 = hap3= s = 0;
		while(s < num) {
			s++;
			hap1+=s;
			
			if(s%2==0)
				hap2+=s;
			else
				hap3+=s;
		} 
		
		System.out.println("1~�Է±����� ��: "+hap1);
		System.out.println("1~�Է±����� ¦�� ��: "+hap2);
		System.out.println("1~�Է±����� Ȧ�� ��: "+hap3);
		sc.close();
	}
}
