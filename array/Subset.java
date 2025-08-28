//leetcode ques no 78
https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        solve(nums, output, 0, ans);
        return ans;
    }
    private void solve(int nums[], List<Integer> output, int index,List<List<Integer>> ans){
        // base case
        if(index>= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        // exclude current element
        solve(nums,output,index+1,ans);

        // include current elememnt
        output.add(nums[index]);
        solve(nums,output,index+1,ans);

        // backtrack remove last element
        output.remove(output.size()-1);
    }
}
