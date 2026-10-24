class Solution {
    public char nextGreatestLetter(char[] nums, char target) {
     char smallest = nums[0];
     for(int i = 0;i<nums.length;i++){
        if(nums[i]-target > 0) return nums[i];
     }
     return smallest;
    }
}