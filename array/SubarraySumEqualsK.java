// leetcode ques no 560

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        //prefix sum
        int prefix[] = new int[n];
        prefix[0] = nums[0];
        for(int i = 1;i<n;i++){
            prefix[i] = nums[i]+prefix[i-1];
        }

        // claculating count of subarray sum
        for(int j = 0;j<n;j++){
            if(prefix[j]==k){
                count++;
            }
            int val = prefix[j] - k;
            if(map.containsKey(val)){
                count = count+map.get(val);
            }
            map.put(prefix[j], map.getOrDefault(prefix[j], 0) + 1);

        }
        return count;
    }
}
