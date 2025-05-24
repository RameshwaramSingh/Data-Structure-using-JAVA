class Solution {
    public int lengthOfLastWord(String s) {
        String ans[] = s.split(" ");
        int res = 0;
        for(int i = 0;i<ans.length;i++){
            if(i==ans.length-1){
                res = ans[i].length();
            }
        }
        return res;
    }
}
