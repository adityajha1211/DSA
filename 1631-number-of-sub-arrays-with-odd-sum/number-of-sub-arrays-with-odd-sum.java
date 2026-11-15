class Solution {
    public int numOfSubarrays(int[] nums) {
        int modulo = 1000000007;
        int even = 1;
        int odd = 0;
        int presum = 0;
        int count = 0;

        for(int ok: nums){
            presum+=ok;
            if(presum % 2 == 0){
            count = count+odd;
            even++;
            } else {
             count  = count+even;
             odd++;
            }
            count = count % modulo;
        }
        return count;
    }
}