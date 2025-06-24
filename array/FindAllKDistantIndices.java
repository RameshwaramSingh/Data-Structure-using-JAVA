//this is my code
//leetcode 2200
https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/description/?envType=daily-question&envId=2025-06-24
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == key){
                index.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<index.size();j++){
                if(Math.abs(i-index.get(j))<=k){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}
