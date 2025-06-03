class Solution {
    public int removeDuplicates(int[] nums) {
        int k =0;
        int start=0;
        int end = 0;
        while(end<nums.length){
            if(start==end){
                nums[k] = nums[start];
                end++;
                k++;
            }
            else if(nums[start]==nums[end]){
                end++;
            }
            else if(nums[start]!=nums[end]){
                start = end;
            }
        }
        return k;
    }
}
