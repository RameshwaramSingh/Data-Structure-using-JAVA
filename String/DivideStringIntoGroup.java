//leetcode ques no 2138
https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/?envType=daily-question&envId=2025-06-22
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = (s.length()+k-1)/k;
        String ans[] = new String[len];
        for(int i = 0;i<len;i++){
            ans[i] = "";
        }
        int n = k;
        int j = 0;
        ans[j] = "";
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(k>0){
                ans[j] = ans[j]+(c);
                n--;
            }
            if(n==0){
                j++;
                n=k;
            }
        }
        while(n!=k&&n>0){
            ans[j]+=fill;
            n--;
        }
        return ans;
    }
}
