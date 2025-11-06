// leetcode 279
https://leetcode.com/problems/perfect-squares/

class Solution {
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
       return solveTab(n);
    }

    private int solveMem(int n, int[] dp){
        if(n==0) return 0;

        if(dp[n] != -1) return dp[n];
        int ans = n;
        for(int i = 1; i*i<=n; i++){
            int temp = i*i;
            ans = Math.min(ans,1+solveMem(n-temp,dp));
        }
        dp[n] = ans;
        return dp[n];
    }

    private int solveTab(int n){
        int dp[] = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j*j<=n;j++){
                int temp = j*j;

                if(i-temp>=0)
                dp[i] = Math.min(dp[i],1+dp[i-temp]);
            }
        }
        
        return dp[n];
    }
}
