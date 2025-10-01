// leetcode ques no 1518
https://leetcode.com/problems/water-bottles/?envType=daily-question&envId=2025-10-01

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int num = numBottles;
        int total = num;
        while(num>=numExchange){
            int rem = num%numExchange;
            num = num/numExchange;
            total += num;
            num = num +rem;
        }
        return total;
    }
}
