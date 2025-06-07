
https://leetcode.com/problems/max-consecutive-ones-iii/

class Solution {
    public int longestOnes(int[] arr, int k) {

//this is my local logic so it takes too much time but it was submitted

        int currCount = 0;
        int maxCount = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int p =k;
        while(end<arr.length){
            if(arr[end]==1){
                currCount++;
                end++;
            }
            else if(k>=1 && arr[end] == 0){
                currCount++;
                k--;
                end++;
            }
            else if(k==0 && arr[end]==0){
                start++;
                end = start;
                k = p;
                currCount = 0;
            }

            if(currCount>maxCount){
                maxCount = currCount;
            }
        }
        return maxCount;
    }
}
