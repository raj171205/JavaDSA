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
            int startcolum = 0;
            int endcolum = n-1;
            while(startcolum <= endcolum){
                int temp = matrix[i][startcolum];
                matrix[i][startcolum] = matrix[i][endcolum];
                matrix[i][endcolum] = temp;
                startcolum++;
                endcolum--;
            }
        }
     
    }
}