class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int n: nums){
            ans.put(n,ans.getOrDefault(n,0)+1);
        }
        for(int ok: nums){
            if(ans.get(ok)>1) return ok;
        }
        return -1;
    }
}