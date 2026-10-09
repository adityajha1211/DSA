class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum = 0;
        int[] sum1 = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum1[i] = sum;
            sum = sum+nums[i];
        }
        int[] sum2 = new int[nums.length];
        int netsum = 0;
        for(int i = 0;i<nums.length;i++){
            netsum = netsum+nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            sum2[i] = netsum-nums[i];
            netsum = netsum-nums[i];
        }
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            result[i] = Math.abs(sum1[i]-sum2[i]);
        }
        return result;
    }
}