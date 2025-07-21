
//leetcode ques no 1957
https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/?envType=daily-question&envId=2025-07-21

class Solution {
    public String makeFancyString(String s) {

        //This is my code

        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i =1;i<s.length();i++){
        char ch = s.charAt(i);
        if(count<3){
            sb.append(s.charAt(i-1));
        }
        if(s.charAt(i-1)==ch){
            count++;
        }
         if(s.charAt(i-1)!=ch){
            count = 1;;
        }
        
        }
        if(count <3){
            sb.append(s.charAt(s.length()-1));
        }
        return sb.toString();
    }
}
