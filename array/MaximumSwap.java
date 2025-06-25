//leetcode ques no 670
https://leetcode.com/problems/maximum-swap/submissions/1676151206/

class Solution {
    public int maximumSwap(int num) {
        char[] digit = Integer.toString(num).toCharArray();
        int last[] = new int[10];
        for(int i = 0;i<digit.length;i++){
            last[digit[i]-'0'] = i;
        }
        for(int i = 0;i<digit.length;i++){
            for(int d = 9;d>digit[i]-'0';d--){
                if(last[d]>i){
                    char temp = digit[i];
                    digit[i] = digit[last[d]];
                    digit[last[d]] = temp;
                    return Integer.parseInt(new String(digit));
                }
            }
        } 
        return num;
    }
}
