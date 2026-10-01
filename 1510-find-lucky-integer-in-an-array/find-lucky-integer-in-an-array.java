class Solution {
    public int findLucky(int[] nums) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }
        int ok = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==ans.get(nums[i])) {
               ok = Math.max(ok,ans.get(nums[i]));
                continue;
            }
        }
      return ok;
    }
}