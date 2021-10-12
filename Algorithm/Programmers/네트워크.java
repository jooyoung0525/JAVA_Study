class Solution {
    static boolean visit[];
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j)continue;
                if(computers[i][j]==1&&!visit[j]){
                    visit[j]=true;
                    DFS(j,n,computers);
                    answer++;
                }
            }
        }
        
        for(int i = 0; i<n; i++){
           if(!visit[i])answer++;
        }
        return answer;
    }
    
    public void DFS(int y, int n, int[][]computers){
        for(int i = 0; i<n; i++){
            if(i==y)continue;
            if(computers[y][i]==1&& !visit[i]){
                visit[i]=true;
                DFS(i,n,computers);
            }
        }
    }
}
