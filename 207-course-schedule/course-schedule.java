class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] ok: prerequisites){
            int course = ok[0];
            int parent = ok[1];
            graph.get(parent).add(course);
            indegree[course]++;
        }
        Queue<Integer> ans = new LinkedList<>();
        for(int i = 0;i<numCourses;i++){
            if(indegree[i]==0){
                ans.offer(i);
            }
        }
        int count = 0;
        while(!ans.isEmpty()){
          int course = ans.poll();
          count++;
          for(int child: graph.get(course)){
            indegree[child]--;
            if(indegree[child]==0) ans.offer(child);
          }
        }
        return count==numCourses;
    }
}