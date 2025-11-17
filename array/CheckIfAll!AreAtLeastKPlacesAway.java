// leetcode ques no 1437

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 1 && count==-1){
                count =0;
            }
            else if(nums[i] == 1 && count>=k){
                count = 0;
            }
            else if(nums[i] == 1 && count<k){
                return false;
            }
            if(nums[i] == 0 && count!=-1){
                count++;
            }
        }
        return true;
    }
}
