// leetcode ques no 1023
https://leetcode.com/problems/camelcase-matching/description/

class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for(String q : queries){
            ans.add(isMatch(q,pattern));
        }
        return ans;
    }
    private Boolean isMatch(String query, String pattern){
        int i = 0, j= 0;
        while(i<query.length() && j<pattern.length()){
            if(query.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            else{
                if(Character.isLowerCase(query.charAt(i))){
                    i++;
                }
                else{
                    return false;
                }
            }
        }
        if(j!=pattern.length()){
            return false;
        }
        while(i<query.length()){
            if(Character.isUpperCase(query.charAt(i))){
                return false;
            }
            i++;
        }
        return true;
    }
}
