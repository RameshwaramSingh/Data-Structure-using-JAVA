//leetcode ques no 2300
https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=daily-question&envId=2025-10-08


class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            long need = (success + spells[i] - 1) / spells[i]; // ceil(success / spell)
            int idx = lowerBound(potions, need);
            ans[i] = m - idx;
        }
        return ans;
    }

    private int lowerBound(int[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] < target) 
            l = mid + 1;
            else r = mid;
        }
        return l;
    }
}
