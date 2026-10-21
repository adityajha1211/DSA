class Solution {
    public int minimumEffortPath(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int[][] dist = new int[n][m];
        for(int[] ok : dist){
            Arrays.fill(ok,Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        PriorityQueue<int[]> ans = new PriorityQueue<>((a,b)->a[0]-b[0]);
        ans.offer(new int[]{0,0,0});
        int[][] direction = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

        while(!ans.isEmpty()){
            int[] current = ans.poll();
            int effort = current[0];
            int row = current[1];
            int column = current[2];
            if(effort>dist[row][column]) continue;
            if(row == n-1 && column == m-1) return effort;
            for(int[] jha: direction){
                int newRow = jha[0]+row;
                int newCol = jha[1]+column;
                if(newRow<0 || newRow>=n || newCol <0 || newCol>=m) continue;
                int newedgeeffort = Math.abs(nums[row][column]-nums[newRow][newCol]);
                int neweffort = Math.max(effort,newedgeeffort);
                if(neweffort<dist[newRow][newCol]){
                    dist[newRow][newCol] = neweffort;
                    ans.offer(new int[]{neweffort,newRow,newCol});
                }
            }
        }
        return 0;
    }
}