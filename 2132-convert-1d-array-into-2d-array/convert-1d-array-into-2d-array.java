class Solution {
    public int[][] construct2DArray(int[] nums, int m, int n) {
        int k = 0;
        int[][] ans = new int[m][n];
        if(nums.length!=m*n) return new int[][]{};
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                ans[i][j] = nums[k];
                k++;
            }
        }
        return ans;
    }
}