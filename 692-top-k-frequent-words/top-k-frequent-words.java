class Solution {
    public List<String> topKFrequent(String[] nums, int k) {
        HashMap<String,Integer> ans = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<String> ok = new PriorityQueue<>((a,b)->{
            if(!ans.get(a).equals(ans.get(b))){
                return ans.get(a)-ans.get(b);
            }
            return b.compareTo(a);
    });
        for(String word: ans.keySet()){
            if(ok.size()<k){
                ok.offer(word);
            } else {
                String top = ok.peek();
                if(ans.get(word)>ans.get(top) || (ans.get(word).equals(ans.get(top)) && word.compareTo(top)<0)){
                    ok.poll();
                    ok.offer(word);
                }
            }
        }
        ArrayList<String> jha = new ArrayList<>();
        while(!ok.isEmpty()){
            jha.add(ok.poll());
        }
        Collections.reverse(jha);
        return jha;
    }
}