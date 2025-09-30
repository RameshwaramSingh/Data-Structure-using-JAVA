// leetcode quesno 647
https://leetcode.com/problems/palindromic-substrings/description/


// class Solution {

    // this is my solution
//     public int countSubstrings(String s) {
//         int count = 0;
//         int start = 0;
//         int end = s.length()-1;
//         for(int i = 0;i<s.length();i++){
//             for(int j = s.length()-1; j>=i;j--){
//                 if(isPalindrome(s,i,j)){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }

//     private boolean isPalindrome(String s, int start, int end){
//         while(start<=end){
//             if(s.charAt(start) == s.charAt(end)){
//                 start++;
//                 end--;
//             }
//             else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }



// this is optimized solution
class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        // There are 2n - 1 possible "centers" for palindromes:
        // (n single characters + n-1 gaps between characters)
        for (int center = 0; center < 2 * n - 1; center++) {
            
            // Compute left and right pointers for this center
            // If center is even → both pointers at same char (odd-length palindrome)
            // If center is odd → pointers between two chars (even-length palindrome)
            int left = center / 2;
            int right = left + center % 2;

            // Expand around the current center while substring is a palindrome
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                count++;      // valid palindrome found
                left--;       // expand leftwards
                right++;      // expand rightwards
            }
        }

        // Return total number of palindromic substrings found
        return count;
    }
}
