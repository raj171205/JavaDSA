class Solution {
    public int countNegatives(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int countNegative = 0;

        for(int row=0;row<m;row++){
            for(int colum=0;colum<n;colum++){
                int val = arr[row][colum];
                if(val < 0){
                    countNegative++;
                }
            }
        }
        return countNegative++;
    }
}