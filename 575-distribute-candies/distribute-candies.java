class Solution {
    public int distributeCandies(int[] nums) {
        int ok = nums.length/2;
        HashSet<Integer> jha = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            jha.add(nums[i]);
        }
        if(ok<jha.size()) return ok;
        else return jha.size();
    }
}