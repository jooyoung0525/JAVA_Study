package ex0729_Array;

import java.util.Scanner;
import java.util.Arrays;

public class Array_Quiz8_Lotto_pdf3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int buy = 0;
		int []lotto_num = new int[6];
		
		/*
		do {
			System.out.print("�ζ� ���Ű���[1~5] ? ");
			buy = sc.nextInt();
		}while(buy<1 || buy>6);
		*/
		
		System.out.println("**�̹��� �ζ� ��÷��ȣ**");
		for(int i = 0; i<6; i++)
		{
			//System.out.print((i+1)+"��°:");
			System.out.print("[");
			for(int j = 0; j<6; j++)
			{
				lotto_num[j] = (int)(Math.random()*45)+1;
				for(int k = 0; k<j; k++)
				{
					if(lotto_num[k]==lotto_num[j]) {
						j--;
						break;
					}
				}
			}
			Arrays.sort(lotto_num);
			
			for(int a : lotto_num)
				System.out.printf(" %2d",a);
			System.out.print("]");
			System.out.println();
		}
		
		
		
		sc.close();
	}
}
