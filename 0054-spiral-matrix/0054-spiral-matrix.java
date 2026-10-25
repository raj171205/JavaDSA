class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int sr=0;
        int er=m-1;
        int sc=0;;
        int ec=n-1;

        while(sr <= er && sc <= ec){
            // row wise left to right -> startinrow print karni hai from starting colum to ending colum
            for(int i=sc;i<=ec;i++){
                result.add(matrix[sr][i]);
            }
            sr++;
            // colum wise top to bottom -> endingcolum print karni hai  from starting row to ending row;
            for(int j=sr;j<=er;j++){
                result.add(matrix[j][ec]);
            }
            ec--;

            //row wise right to left -> endingrow print karni hai from ending colum to starting colum

            if(sr<=er){
                for(int k=ec;k>=sc;k--){
                result.add(matrix[er][k]);
            }
            er--;
            }
            //clum wise bottom to top -> starting colum print karni hai  from endingrow to starting row

            if(sc<=ec){
                for(int l=er;l>=sr;l--){
                result.add(matrix[l][sc]);
            }
            sc++;
            }
        }
        return result;
    }
}