//leetcode ques no 1304
https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/?envType=daily-question&envId=2025-09-07

class Solution {
    public int[] sumZero(int n) {
        int sum = 0;
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){

            if(i!=n-1){
                arr[i] = (n-i)*(-1);
                sum = sum+((n-i)*1);
            }
            else{
                arr[i] = sum;
            }
        }
        return arr;
    }
}
