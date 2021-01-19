import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        //큐에 프린트할 목록 저장
        Queue<Info>que = new LinkedList<>();
        
        for(int i = 0; i<priorities.length; i++) {
        	Info info = new Info(i, priorities[i]);
        	que.add(info);
        }
        
        //출력순서 소팅
        Arrays.sort(priorities);
        int nowIdx = priorities.length-1;
       
        while(!que.isEmpty()) {
        	
        	Info nowInfo = que.poll();
        	if(location == nowInfo.name && priorities[nowIdx] == nowInfo.order) {
        		answer++;
        		break;
        	}
        	
        	if(priorities[nowIdx]==nowInfo.order) {
        		answer++;
        		nowIdx--;
        		continue;
        	}else {
        		que.add(nowInfo);
        	}
        }
        
        
        return answer;
    }
	
	static class Info{
		int name;
		int order;
		
		public Info(int name, int order) {
			super();
			this.name = name;
			this.order = order;
		}
	}
}
