// leetcode ques no 3100
https://leetcode.com/problems/water-bottles-ii/description/?envType=daily-question&envId=2025-10-02


class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        // Start with the initial number of full bottles drunk
        int totalDrunk = numBottles; 
        
        // This is the number of empty bottles available for exchange
        int emptyBottles = numBottles; 
        
        // Loop continues as long as we have enough empty bottles 
        // to meet the current exchange cost (numExchange)
        while (emptyBottles >= numExchange) {
            
            // 1. Perform the exchange: Use numExchange empty bottles to get 1 new full bottle
            
            // The empty bottles used up for the exchange
            emptyBottles -= numExchange; 
            
            // We drink the new full bottle
            totalDrunk++; 
            
            // The newly drunk bottle becomes a new empty bottle
            emptyBottles++; 
            
            // 2. Increase the cost for the next exchange
            numExchange++; 
        }
        
        return totalDrunk;
    }
}
