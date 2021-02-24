// #프로그래머스 2021KAKAO BLIND 신규아이디추천

package programers;

public class RecommendNewId {
	public static void main(String[] args) {
		System.out.println(solution("abcdefghijklmn.p"));
	}

	public static String solution(String new_id) {
		String answer = "";
		if (new_id.length() > 0) {
			// 1단계. 대문자 -> 소문자
			answer = new_id.toLowerCase();

			// 2단계. 소문자,숫자,빼기,밑줄,마침표 제외한 모든 문자제거
			answer = answer.replaceAll(
					"[~|!|@|#|$|%|\\^|&|*|\\(|\\)|\\{|\\}|\\[|\\]|+|=|?|>|<|,|/|:]", "");
			
			// 3단계. 마침표가 2회이상 연속되면, 하나의 마침표로 치환
			String pattern = "[.]{2,1000}";
			answer = answer.replaceAll(pattern, ".");
			
			// 4단계. 마침표가 처음이나 끝에 위치하면 제거
			if (answer.charAt(0) == '.') {
				if(answer.length()>=2) {
					answer = answer.substring(1, answer.length());
				}else {
					answer = "";
				}
			}else if (answer.charAt(answer.length() - 1) == '.') {
				if(answer.length()>=2) {
					answer = answer.substring(0, answer.length() - 1);
				}else {
					answer="";
				}
			}
			
			// 5단계. 빈문자열일경우 'a'대입
			if (answer.length() == 0) {
				answer += 'a';
			}

			// 6단계. 길이가 16자이상이면 첫 15개의 문자만 남기고 삭제
			if (answer.length() >= 16) {
				answer = answer.substring(0, 15);
			}
			if(answer.charAt(answer.length()-1)=='.') {
				answer = answer.substring(0,answer.length()-1);
			}
			
			// 7단계. 길이가 2이하면, 마지막 문자를 길이가 3이되도록 반복해서 붙임
			int len = answer.length();
			char last = answer.charAt(answer.length()-1);
			
			if (len <= 2) {
				String lastchar = Character.toString(last);
				
				for (int i = 0; i < 3-len; i++) {
					answer += lastchar;
				}
			}
		}else {
			// 5단계. 빈문자열일경우 'a'대입
			if (answer.length() == 0) {
				answer += 'a';
			}
			// 7단계. 길이가 2이하면, 마지막 문자를 길이가 3이되도록 반복해서 붙임
			int len = answer.length();
			char last = answer.charAt(answer.length()-1);
			
			if (len <= 2) {
				String lastchar = Character.toString(last);
				
				for (int i = 0; i < 3-len; i++) {
					answer += lastchar;
				}
			}
		}

		return answer;
	}

}
