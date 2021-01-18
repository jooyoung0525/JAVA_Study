package programers;

import java.util.Stack;

public class Pickdoll {
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		System.out.println(solution(board, moves));
	}
	
	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        
	        Stack<Integer>st = new Stack<Integer>();
	        
	        for(int i = 0; i<moves.length; i++) {
	        	int row = moves[i]-1;
	        	int nowNum = 0;
	        	
	        	//보드 검사
	        	for(int j = 0; j<board.length; j++) {
	        		if(board[j][row]==0)continue;
	        		nowNum = board[j][row];
	        		board[j][row]=0;
	        		break;
	        	}
	        	
	        	if(nowNum == 0) continue;
	        	if(st.empty()) {
	        		st.push(nowNum);
	        		continue;
	        	}
	        	
	        	boolean flag = false;
	        	while(!st.empty()) {
	        		int downNum = st.peek();
	        		
	        		if(nowNum == downNum) {
	        			st.pop();
	        			answer++;
	        			flag = true;
	        		}else {
	        			if(!flag) {
	        				st.push(nowNum);
	        			}
	        			break;
	        		}
	        	}
	        	
	        	if(flag) answer++;
	        	
	        	
	        }
	     
	        return answer;
	}
}
