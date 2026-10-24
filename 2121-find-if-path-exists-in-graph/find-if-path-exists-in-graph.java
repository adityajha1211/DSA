class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
          ans.add(new ArrayList<>());
        }
        for(int[] ok: edges){
            int u = ok[0];
            int v = ok[1];
            ans.get(u).add(v);
            ans.get(v).add(u);
        }
        boolean[] visited = new boolean[n];
        return dfs(source, destination, ans, visited);
    }
           public boolean dfs(int source, int destination,List<List<Integer>> ans, boolean[] visited) {
           if (source == destination) return true;
           visited[source] = true;
           for (int neighbor:ans.get(source)) {
            if (!visited[neighbor]) {
            if (dfs(neighbor, destination, ans, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}