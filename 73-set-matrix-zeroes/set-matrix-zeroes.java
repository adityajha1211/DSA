class Solution {
    public void setZeroes(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        ArrayList<int[]> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==0){
                 ans.add(new int[]{i,j});
                }
            }
        }
        for(int i = 0;i<ans.size();i++) {
        int key = ans.get(i)[0];
        int value = ans.get(i)[1];
        for(int row = 0;row<n;row++){
            grid[row][value] = 0;
        }
        for(int j = 0;j<m;j++){
            grid[key][j] = 0;
        }
      }
    }
}