//leetcode ques no 8

class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        
        int i = 0, n = s.length();
        int sign = 1; // default sign is positive
        long result = 0; // use long to detect overflow
        
        // Step 2: Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // Step 3: Handle sign if present
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // Step 4: Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            
            // Step 5: Clamp to 32-bit signed int range
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            
            i++;
        }
        
        // Step 6: Return final result
        return (int)(sign * result);
    }
}
