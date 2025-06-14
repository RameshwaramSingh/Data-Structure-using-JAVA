
https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/description/?envType=daily-question&envId=2025-06-14

class Solution {
    public int minMaxDifference(int num) {
        String s = Integer.toString(num);

        // For max number: replace the first non-9 digit with 9
        char toReplaceMax = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        String maxStr = (toReplaceMax == ' ') ? s : s.replace(toReplaceMax, '9');

        // For min number: replace the first digit (not 1 if it's first) with 0
        char toReplaceMin = s.charAt(0);
        String minStr = s.replace(toReplaceMin, '0');

        int max = Integer.parseInt(maxStr);
        int min = Integer.parseInt(minStr);

        return max - min;
    }
}
