class Solution {

    public int []memo=new int[100010];

    public int solution(int n) {

        memo[0]=0;
        memo[1]=1;

        for(int i = 2; i<=n; i++){
            memo[i]=(memo[i-1]+memo[i-2])%1234567;

        }

        return memo[n];
    }
}