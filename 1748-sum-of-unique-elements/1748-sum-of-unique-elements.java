class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int arr[] = new int[101];
        int sum = 0;
        for(int i=0;i<n;i++){
            int x = nums[i];
            arr[x]++;
        }
        for(int j=0;j<101;j++){
            if(arr[j]==1){
                sum = sum + j;
            }
        }
        return sum;
    }
}