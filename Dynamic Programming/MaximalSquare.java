// leetcode 221


class Solution {
    int max = 0;

    public int maximalSquare(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        //solveMem(matrix, 0, 0, dp);
        solveTab(matrix);
        return max * max; // return area
    }

    private int solveMem(char[][] matrix, int i, int j, int[][] dp) {
        if (i >= matrix.length || j >= matrix[0].length) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int right = solveMem(matrix, i, j + 1, dp);
        int diagonal = solveMem(matrix, i + 1, j + 1, dp);
        int down = solveMem(matrix, i + 1, j, dp);

        if (matrix[i][j] == '1') {
            dp[i][j] = 1 + Math.min(right, Math.min(diagonal, down));
            max = Math.max(max, dp[i][j]); // updates global max
            return dp[i][j];
        } else {
            return dp[i][j] = 0;
        }
    }

    private int solveTab(char[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] dp = new int[row+1][col+1];
        for (int[] rows : dp) {
            Arrays.fill(rows, 0);
        }

        for(int i = row-1;i>=0;i--){
            for(int j = col-1;j>=0;j--){
                int right = dp[i][j+1];
                int diagonal = dp[i+1][j+1];
                int down = dp[i+1][j];

            if (matrix[i][j] == '1') {
            dp[i][j] = 1 + Math.min(right, Math.min(diagonal, down));
            max = Math.max(max, dp[i][j]); // updates global max
        } else {
            dp[i][j] = 0;
        }
            }
        }
        return dp[0][0];
    }
}
