class Solution {
    public int findCheapestPrice(int n, int[][] nums, int src, int dst, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e: nums){
            int u = e[0];
            int v = e[1];
            int w = e[2];
            graph.get(u).add(new int[]{v,w});
        }
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        Queue<int[]> ans = new LinkedList<>();
        ans.offer(new int[]{0,src,0});
        dist[src] = 0;
        while(!ans.isEmpty()){
            int[] current = ans.poll();
            int cost = current[0];
            int node = current[1];
            int stops = current[2];
            if(stops>k) continue;
               for(int[] edge: graph.get(node)){
                    int neighbour = edge[0];
                    int weight = edge[1];
                    int newdistance = weight+cost;
                    if(newdistance<dist[neighbour]){
                        dist[neighbour] = newdistance;
                        ans.offer(new int[]{newdistance, neighbour, stops + 1});
                    }
        }
    }
    return dist[dst] ==Integer.MAX_VALUE?-1:dist[dst];
}
}