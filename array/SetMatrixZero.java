https://leetcode.com/problems/set-matrix-zeroes/?envType=study-plan-v2&envId=top-interview-150
//leetcode ques no 73

class Solution {
    public void setZeroes(int[][] matrix) {
        better(matrix);

        //optimal solution exist
    }
    
    static void better(int[][] matrix){
    //this is used to take extra space 
    //time complexity O(2*m*n)
    //space complexity O(m+n)

        int m = matrix.length;
        int n = matrix[0].length;
        int col[] = new int[n];
        int row[] = new int[m]; 

        //this loop is used to store at which index 0 is present in row and column
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        //this loop is used to set the matix zero with help of the row and column 
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
