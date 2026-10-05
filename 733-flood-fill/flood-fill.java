class Solution {
    public int[][] floodFill(int[][] grid, int sr, int sc, int color) {
        int newColor = grid[sr][sc];
        if(newColor == color) return grid;
        dfs(grid,sr,sc,newColor,color);
        return grid;
    }
    private void dfs(int[][] grid, int sr, int sc,int newColor, int color){
        if(sr<0|| sr> grid.length-1||
        sc<0||sc>grid[0].length-1) return;
        if(grid[sr][sc] != newColor) return;
        grid[sr][sc]=color;
        dfs(grid,sr-1,sc,newColor,color);
        dfs(grid,sr+1,sc,newColor,color);
        dfs(grid,sr,sc-1,newColor,color);
        dfs(grid,sr,sc+1,newColor,color);
    }
}