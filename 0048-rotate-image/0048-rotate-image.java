class Solution {
    public void rotate(int[][] matrix) {
        //transpose a matrix
        // Swap matrix[j][i] = matrix[i][j]
        int m = matrix.length;
        int n = matrix[0].length;
        //row travesal
        for(int i=0;i<m;i++){
            //colum traversal
            for(int j=i+1;j<n;j++){
                //swap matrix[i][j],matrix[j][i];
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse all row of matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
     
    }
}