package ex0806_Calender_Date_StringTokenizer_Wrapper_CLASS;

import java.util.StringTokenizer;

public class StringTokenizer_Ex2 { //split으로 해도 됨
	public static void main(String[] args) {
		String s = "서울,부산:대구;광주,인천";
		
		//문자열을 구분자로 분류
		//StringTokenizer st = new StringTokenizer(s,",:;"); //",:;"는 구분자가 3개 
		StringTokenizer st = new StringTokenizer(s,",:;",true); //true이면 구분자도 nextToken()에 넘겨 받음 
		
		
		String str;
		while(st.hasMoreTokens()) {
			str = st.nextToken();
			System.out.println(str);
		}
		
	}
}
