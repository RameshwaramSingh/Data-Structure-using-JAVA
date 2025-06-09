
https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int strStr(String haystack, String needle) {

//this is my logic 

        int l = needle.length();
        int count = 0;
        int first = 0;
        int second =0;
        while(first<haystack.length()){
            if(haystack.charAt(first)==needle.charAt(second)){
                first++;
                second++;
                count++;
            }
            else if(haystack.charAt(first)!=needle.charAt(second)){
                first = first-second;
                second = 0;
                count =0;
                first++;
            }
            if(count == l){
                first = first-l;
                return first;
            }
        }
        return -1;
    }
}
