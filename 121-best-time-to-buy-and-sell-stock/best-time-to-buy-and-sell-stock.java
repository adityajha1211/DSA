class Solution {
    public int maxProfit(int[] nums) {
        // int minvalue = Integer.MAX_VALUE;
        // int maxprofit = 0;
        // for(int i = 0;i<prices.length;i++){
        //     if(minvalue>prices[i]) minvalue = prices[i];
        //     else maxprofit = Math.max(maxprofit,prices[i]-minvalue);
        // }
        // return maxprofit;
        int mini = nums[0];
        int profit = 0;
        for(int i = 1;i<nums.length;i++){
            int ok = nums[i]-mini;
            profit = Math.max(profit,ok);
            mini = Math.min(mini,nums[i]);
        } 
        return profit;
    }
}