package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.Scanner;

public class Find_Lastname_Kim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int count;
		
		//이름을 입력 받아 김씨의 인원수를 count하기
		//단, 입력받은 이름이 end 이면 종료
		
		
		count = 0;
		
		while(true) {
			System.out.print("이름?");
			s = sc.next();
			
			if(s.equalsIgnoreCase("end")) break;
			
			/*
			//방법1)
			if(s.indexOf("김")==0) //0이어야함!!!!
				count++;
			*/
			
			if(s.startsWith("김"))count++;
		}
		
		System.out.print("\n김씨의 수: "+count);
		
		
		
		sc.close();
	}
}
