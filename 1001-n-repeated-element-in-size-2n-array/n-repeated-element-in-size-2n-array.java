class Solution {
    public int repeatedNTimes(int[] nums) {
        // HashMap<Integer,Integer> ans = new HashMap<>();
        // for(int n: nums){
        //     ans.put(n,ans.getOrDefault(n,0)+1);
        // }
        // for(int ok: nums){                                HashSet
        //     if(ans.get(ok)>1) return ok;
        // }
        // return -1;
        HashSet<Integer> ans = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(ans.contains(nums[i])) return nums[i];
            else ans.add(nums[i]);
        }
        return -1;
    }
}