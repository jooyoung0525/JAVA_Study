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
		String []ss = new String[]{"서울","부산","대구","인천","경기","광주","제주","대전"};
		print("source data",ss);
		
		//문자열 정렬
		Arrays.sort(ss);
		print("sort data",ss);
		
		
	}
}
