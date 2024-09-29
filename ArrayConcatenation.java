package com.priyanshu;
import java.util.*;
class Solution {
    public int[] getConcatenation(int[] nums) {
        Scanner sc = new Scanner(System.in);
        int len = nums.length;
        int[] ans = new int[2*len];
        for(int i = 0; i<len;i++){
            ans[i] = nums[i];
            ans[i+len] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,3,2,1};
        Solution obj= new Solution();
        System.out.println(Arrays.toString(obj.getConcatenation(nums)));
    }
}
