// leetcode ques no 3195
https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/?envType=daily-question&envId=2025-08-22

class Solution {
    public int minimumArea(int[][] grid) {
        int minRow = Integer.MAX_VALUE, maxRow = -1;
        int minCol = Integer.MAX_VALUE, maxCol = -1;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }

        // In case there are no '1's, you might want to return 0 or handle accordingly
        if (maxRow == -1) {
            return 0;
        }

        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }
}
