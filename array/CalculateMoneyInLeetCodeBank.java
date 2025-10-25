// leetcode 1716
https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/?envType=daily-question&envId=2025-10-25

class Solution {
    public int totalMoney(int n) {
        int day = 1;
        int total = 0;
        int extra = 0;
        for(int i = 0;i<n;i++){
            total = total+(extra+day);
            day++;
            if(day>7){
                day = 1;
                extra++;
            }
        }
        return total;
    }
}
