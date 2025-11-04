// leetcode 983
https://leetcode.com/problems/minimum-cost-for-tickets/description/

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days.length];
        Arrays.fill(dp,-1);
        return solveMem(0,days,costs,dp);
    }

    public int solveMem(int index,int days[], int costs[], int dp[]){
        if(index>=days.length) return 0;

        if(dp[index]!=-1) return dp[index];

        // option 1: buy 1 day pass
        int cost1 = costs[0]+solveMem(index+1,days,costs,dp);

        //option 2: buy 7 day pass
        int i = 0;
        
        for( i = index;i<days.length && days[i]<days[index]+7;i++);
        int cost7 = costs[1] + solveMem(i,days,costs,dp);

        // option 3: buy 30 day pass
        for( i = index;i<days.length && days[i]<days[index]+30;i++);
        int cost30 = costs[2] + solveMem(i,days,costs,dp);

        return dp[index] = Math.min(cost1, Math.min(cost7, cost30));
    }
}
