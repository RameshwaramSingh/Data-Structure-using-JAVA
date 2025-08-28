// leetcode ques no 46
https://leetcode.com/problems/permutations/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }

    private void solve(int nums[], int index, List<List<Integer>> ans){
        if(index>=nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

        for(int j = index;j<nums.length;j++){
            swap(nums,index,j);
            solve(nums,index+1,ans);
            //backtrack (undo swap)
            swap(nums,index,j);
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
