class Solution {
    public int networkDelayTime(int[][] nums, int V, int src) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0;i<=V;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e: nums){
            int u = e[0];
            int v = e[1];
            int w = e[2];
            graph.get(u).add(new int[]{v,w});
        }
        int[] dist = new int[V+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> ans = new PriorityQueue<>((a,b)->
            a[0]-b[0]);
            ans.offer(new int[]{0,src});
            dist[src] = 0;
            while(!ans.isEmpty()){
                int[] current = ans.poll();
                int distance = current[0];
                int node = current[1];
                if(distance>dist[node]) continue;
                for(int[] edge: graph.get(node)){
                    int neighbour = edge[0];
                    int weight = edge[1];
                    int newdistance = weight+distance;
                    if(newdistance<dist[neighbour]){
                        ans.offer(new int[]{newdistance,neighbour});
                        dist[neighbour] = newdistance;
                    }
                }
            }
       int result = 0;
       for(int i = 1;i<=V;i++){
         if(dist[i]==Integer.MAX_VALUE) return -1;
         result = Math.max(result,dist[i]);
       }
       return result;
    }
}