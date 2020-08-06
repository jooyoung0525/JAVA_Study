package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Arrays;

public class Sort_StringArray {
	
	public static void print(String title,String[] ss) {
	
		System.out.print(title+": ");
		for(String a: ss) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		String []ss = new String[]{"����","�λ�","�뱸","��õ","���","����","����","����"};
		print("source data",ss);
		
		//���ڿ� ����
		Arrays.sort(ss);
		print("sort data",ss);
		
		
	}
}
