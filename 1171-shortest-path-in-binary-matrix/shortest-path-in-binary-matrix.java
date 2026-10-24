class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int[][] dist = new int[n][n];
        for(int[] ok : dist){
            Arrays.fill(ok,0);
        }
        if(grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        Queue<int[]> ans = new LinkedList<>();
        dist[0][0] = 1;
        ans.offer(new int[]{0,0});
        int[][] dir = new int[][]{
            {-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}
        };
        while(!ans.isEmpty()){
            int[] distance = ans.poll();
            int row = distance[0];
            int col = distance[1];

            if(row == n-1 && col == n-1) return dist[n-1][n-1];
            for(int[] jha: dir){
                int newRow = row + jha[0];
                int newCol = col + jha[1];
                if(newRow>=0 && newRow<n && newCol>=0 && newCol<n && grid[newRow][newCol]==0&& dist[newRow][newCol] == 0){
                    dist[newRow][newCol] = dist[row][col] +1;
                    ans.add(new int[]{newRow,newCol});
                }
            }
        }
        return -1;
    }
}