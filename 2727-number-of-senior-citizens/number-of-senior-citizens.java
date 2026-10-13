class Solution {
    public int countSeniors(String[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0;i<n;i++){
            int age = 10*(nums[i].charAt(11)-'0')+(nums[i].charAt(12)-'0');
            if(age>60) count++;
        }
        return count;
    }
}