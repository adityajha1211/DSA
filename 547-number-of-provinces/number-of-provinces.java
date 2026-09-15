class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] ok = new boolean[n];
        int provinces = 0;
        for(int i = 0;i<n;i++){
          if(!ok[i]){
            provinces++;
            dfs(i,isConnected,ok);
          }
        }
        return provinces;
    }
    private void dfs(int i,int[][] isConnected,boolean[] ok){
        ok[i] = true;
        for(int j = 1;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && !ok[j]){
                dfs(j,isConnected,ok);
            }
        }
    }
}