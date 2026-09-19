class Solution {
    public int largestAltitude(int[] nums) {
        // nums[0] = 0;
        int max = 0;
        for(int i = 1;i<nums.length;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        for(int i = 0;i<nums.length;i++){
             max = Math.max(max,nums[i]);
        }
        return max;
    }
}