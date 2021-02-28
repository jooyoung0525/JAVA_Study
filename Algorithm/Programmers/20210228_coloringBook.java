// # 프로그래머스 카카오프렌즈 컬러링북

package programers;

public class coloringbook {
	
	static int []dx= {-1,1,0,0};
	static int []dy = {0,0,-1,1};
	static int col, row;
	static int cnt; 
	
	public static void main(String[] args) {
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		int []answer = solution(6,4,picture);
		
		for(int i = 0; i<2; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        col = m; row = n;
        
        boolean [][]check = new boolean[col][row];
        int[] answer = new int[2];
        
       
        for(int i = 0; i < col; i++) { 
        	for(int j  = 0; j < row; j++) {
        		if(picture[i][j]>0 && !check[i][j]) {
        			
        			numberOfArea++; //가보지않은 영역 추가
        			check[i][j]=true;
        			cnt=1;
        			dfs(i,j,picture[i][j],check,picture);
        			
        			if(maxSizeOfOneArea < cnt)
        				maxSizeOfOneArea = cnt;
        			
        		}
        	}
        	
        }
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
	
	public static void dfs(int x, int y, int nownum, boolean [][]check, int [][]nowpic) {
		
		for(int i= 0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx<0||ny<0||nx>=col||ny>=row||check[nx][ny]) continue;
			
			if(nowpic[nx][ny] == nownum) {
				check[nx][ny]=true;
				cnt++;
				dfs(nx,ny,nownum,check,nowpic);
			}
		}
	}
}
