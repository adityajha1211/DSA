class Solution {
    public int rob(int[] nums) {
    int n = nums.length;
    if(n==2){
        return Math.max(nums[0],nums[1]);
    }
     if(n == 1) return nums[0];
     int jha1 = Okay(nums,0,n-2);
     int jha2 = Okay(nums,1,n-1);
     return Math.max(jha1,jha2);
    }
    private int Okay(int[] nums, int start,int end){
     int n = nums.length;
     int[] dp = new int[n];
     dp[start] = nums[start];
     if(start+1<=end) dp[start+1] = Math.max(nums[start+1],nums[start]);

     for(int i = 2+start;i<=end;i++){
        dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
     }
     return dp[end];
    }
}