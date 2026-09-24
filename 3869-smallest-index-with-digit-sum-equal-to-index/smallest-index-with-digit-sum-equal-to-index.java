class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            if(i == Okay(nums[i])) return i;
        }
        return -1;
    }
    private int Okay(int num){
        int sum = 0;
        while(num != 0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}