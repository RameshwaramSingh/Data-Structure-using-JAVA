//leetcode ques no 5

class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String lps = "";
        for(int i =1;i<s.length();i++){
            //consider the odd length
            int low = i;
            int high = i;
            // keep extending both left and right 
            //direction till the conditions for a palindrome are met
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                //termination condition if we reach the end/start of the string
                if(low == -1 || high == s.length()){
                    break;
                }
            }
                //indexes low and high are used to extract the substring
                String palindrome = s.substring(low+1,high);
                if(palindrome.length()>lps.length()){
                    //store the longest palindrome found
                    lps = palindrome;
                }
            //  this is consider for even length
            low = i-1;
            high = i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                //termination condition if we reach the end/start of the string
                if(low == -1 || high == s.length()){
                    break;
                }
            }
            palindrome = s.substring(low+1,high);
                if(palindrome.length()>lps.length()){
                    //store the longest palindrome found
                    lps = palindrome;
                }
        }
        return lps;
    }
}
