class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        // int count = 0;
        for(int i = 0;i<nums.length-1;i++){
           int sum = nums[i]+nums[i+1];
           if(ans.contains(sum)) return true;
           else ans.add(sum);
        }
        return false;
    }
}