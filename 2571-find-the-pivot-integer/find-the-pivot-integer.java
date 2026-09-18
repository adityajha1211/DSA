class Solution {
    public int pivotInteger(int n) {
        int totalsum = n*(n+1)/2;
        int presum = 0;
        // int rightsum = 0;
        for(int i = 1;i<=n;i++){
            if(presum == totalsum-presum-i) return i;
            else presum = presum+i;
        }
        return -1;
    }
}