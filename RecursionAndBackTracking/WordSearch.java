// leetcode ques no 79
https://leetcode.com/problems/word-search/


class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // base case: all characters are found
        if (index == word.length()) return true;
        
        // boundary & mismatch check
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length 
            || board[i][j] != word.charAt(index)) {
            return false;
        }
        
        // mark visited
        char temp = board[i][j];
        board[i][j] = '#';
        
        // explore all 4 directions
        boolean found = dfs(board, word, i + 1, j, index + 1) || // down direction
                        dfs(board, word, i - 1, j, index + 1) || // up direction
                        dfs(board, word, i, j + 1, index + 1) || // right direction
                        dfs(board, word, i, j - 1, index + 1);   // left direction
        
        // backtrack (restore original value)
        board[i][j] = temp;
        
        return found;
    }
}
