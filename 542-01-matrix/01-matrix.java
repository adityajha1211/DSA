class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] jha = new int[n][m];
        Queue<int[]> ans = new LinkedList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]==0){
                    ans.offer(new int[]{i,j});
                    jha[i][j] = 0;
                }
            }
        }
       int[][] ok = {{-1,0},{1,0},{0,-1},{0,1}};
       while(!ans.isEmpty()){
        int[] curr = ans.poll();
        int row = curr[0];
        int col = curr[1];
        for(int[] dir: ok){
            int newRow = row+dir[0];
            int newCol = col + dir[1];
            if(newRow<0|| newRow>=n || newCol<0 || newCol>=m) continue;
            if(grid[newRow][newCol]==1 && jha[newRow][newCol]==0 ){
                jha[newRow][newCol]=jha[row][col]+1;
                ans.offer(new int[]{newRow,newCol});
            }
        }
       }
       return jha;
    }
}