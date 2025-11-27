package com.priyanshu.RecursionAndBackTracking;
import java.util.*;
public class CombinationOfPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits,"",0,ans,mapping);
        return ans;
    }

    private void solve(String digits,String output,int index,List<String> ans, String[] mapping){
        // base case: if we have processed all the digit add current combination
        if(index>=digits.length()){
            ans.add(output);
            return;
        }
        // Get the digit at the current index (convert from char to int)
        int number = digits.charAt(index) - '0';

        // Find the corresponding characters (like "abc" for 2)
        String value = mapping[number];

        // Try every character for this digit
        for (int i = 0; i < value.length(); i++) {
            // Choose one character and move to the next digit
            solve(digits, output + value.charAt(i), index + 1, ans, mapping);
        }
    }
}

