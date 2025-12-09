package com.priyanshu;
public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
    public static void main (String[] args){
        RichestCustomer obj = new RichestCustomer();
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(obj.maximumWealth(accounts));
    }
}

