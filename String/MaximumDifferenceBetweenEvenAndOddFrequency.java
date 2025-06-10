https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/?envType=daily-question&envId=2025-06-10

class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;

        int maxOdd = 0;
        int minEven = s.length();

        for (int f : freq) {
            if (f == 0) continue;
            if (f % 2 == 0)
                minEven = Math.min(minEven, f);
            else
                maxOdd = Math.max(maxOdd, f);
        }

        return maxOdd - minEven;
    }
}
