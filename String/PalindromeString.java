package com.priyanshu.String;
//https://leetcode.com/problems/valid-palindrome/description/
public class PalindromeString {
    static boolean isPalindrome(String s){
       String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int count = 0;
        System.out.println(s1);
        int start =0, end = s1.length()-1;
        while(start<=end){
            if(s1.charAt(start)==s1.charAt(end)){
                count++;
                start++;end--;
            }
            else{
                break;
            }
        }
        if(count==(s1.length()/2)|| count>(s1.length()/2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
