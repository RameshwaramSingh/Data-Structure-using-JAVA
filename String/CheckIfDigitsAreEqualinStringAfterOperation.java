// leetcode 3461
https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/description/?envType=daily-question&envId=2025-10-23

class Solution {
    public boolean hasSameDigits(String s) {
        String ans = s;
        while (ans.length() > 2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < ans.length(); i++) {
                int a = ans.charAt(i - 1) - '0';
                int b = ans.charAt(i) - '0';
                sb.append((a + b) % 10);
            }
            ans = sb.toString();
        }
        return ans.charAt(0) == ans.charAt(1);
    }
}
