package com.priyanshu;

public class IdenticalPair {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        IdenticalPair obj = new IdenticalPair();
        int[] num = {1,2,3,1,1,3};
        int ans = obj.numIdenticalPairs(num);
        System.out.println(ans);
    }
}
