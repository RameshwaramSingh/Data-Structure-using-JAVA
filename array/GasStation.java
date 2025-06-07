
https://leetcode.com/problems/gas-station/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int curr = 0;
        int gasSum = 0;
        int costSum =0;
        for(int i = 0;i<gas.length;i++){
            gasSum = gasSum+gas[i];
            costSum = costSum+cost[i];
        }
        if(costSum>gasSum){
            return -1;
        }
        for(int i =0;i<gas.length;i++){
            curr += (gas[i]-cost[i]);

            if(curr<0){
                start = i+1;
                curr = 0;
            }
        }
        return start;
    }
}
