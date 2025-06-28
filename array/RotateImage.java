// leetcode ques no 48


class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose the matrix
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                //swap the elements diagonally
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse each row
        for(int i =0;i<n;i++){
            int left = 0; int right = n-1;
            while(left<right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
