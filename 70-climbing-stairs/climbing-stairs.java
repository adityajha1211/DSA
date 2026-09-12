class Solution {
    public int climbStairs(int n) {
        // if(n<=2) return n;
        // int a = 1;
        // int b = 2;
        // for(int i = 3;i<=n;i++){
        //     int temp = a+b;
        //     a = b;
        //     b = temp;
        // }
        // return b;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}