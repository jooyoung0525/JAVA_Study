package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.StringTokenizer;

public class StringTokenizer_Ex1 { //split으로 해도 됨
	public static void main(String[] args) {
		String s = "서울,부산,대구,광주,인천";
		
		//문자열을 구분자로 분류
		StringTokenizer st = new StringTokenizer(s,","); //s는 원본, ","는 구분자 
		                                                 //s를 ,로 구분
		
		//countTokens:파싱할 총 문자열 수
		String[] ss = new String[st.countTokens()]; //구분자로 나누어진 문자열 수 반환
		
		int n = 0;
		while(st.hasMoreTokens()) { // 파싱된 문자열이 존재하면 true, 없으면 false
			ss[n++]=st.nextToken(); // 파싱된 문자열
		}
		
		for(int i = 0; i<ss.length; i++) {
			System.out.println(ss[i]);
		}
	}
}
