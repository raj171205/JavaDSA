class Solution {
    public int[][] generateMatrix(int n) {
        int d = 1;
        int [][] matrix = new int[n][n];
        int sr=0;
        int er=n-1;
        int sc = 0;
        int ec = n-1;
        while(sr <= er && sc <= ec){
            for(int i=sc;i<=ec;i++){
                matrix[sr][i] = d;
                d++;

            }
            sr++;

            for(int j=sr;j<=er;j++){
                matrix[j][ec] = d;
                d++;
            }
            ec--;

           if(sr<=er){
             for(int l=ec;l>=sc;l--){
                matrix[er][l] = d;
                d++;
            }
            er--;
           }

           if(sc<=ec){
             for(int s=er;s>=sr;s--){
                matrix[s][sc] = d;
                d++;
            }
            sc++;
           }
        }

        return matrix;

    }
}