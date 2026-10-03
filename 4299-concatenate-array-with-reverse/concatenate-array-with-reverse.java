class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i = 0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        int ok = 0;
        for(int i = nums.length-1;i>=0;i--){
            ans[ok+nums.length] = nums[i];
            ok++;
        }
        return ans;
    }
}