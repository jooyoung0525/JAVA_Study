// #프로그래머스 2020KaKao Blind 문자열압축
package programers;

public class charlength {
	public static void main(String[] args) {
		System.out.println(solution("a"));
	}
	
	
	public static int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        for(int i = 1; i<=(s.length()/2); i++) { //끊을 문자열 길이
        	
        	int count = 1;
        	String ans ="";
        	String before ="";
        	
        	for(int j = 0; j<i; j++) {
        		before+=s.charAt(j);
        	}
        	
        	for(int j = i; j<s.length(); j+=i) {
        		String now="";
        		
        		int k = j;
        		int len = j+i;
        		if(len>=s.length()) len = s.length();
        		
        		for(; k<len; k++) {
        			now+=s.charAt(k);
        		}
        		
        		if(before.equals(now)) {
        			count++;
        		}else {
        			String nowlen="";
        			if(count>1) {
        				nowlen = Integer.toString(count);
        			}
        			nowlen+=before;
        			
        			ans+=nowlen;
        			count=1;
        		}
        		before=now;
        	}
        	String nowlen="";
			if(count>1) {
				nowlen = Integer.toString(count);
			}
			nowlen+=before;
			ans+=nowlen;
			
        	int len = ans.length();
        	
        	if(len<answer)
        		answer = len;
        	
        	ans="";
        }
        if(answer == Integer.MAX_VALUE)
        	answer = s.length();
        return answer;
    }
}
