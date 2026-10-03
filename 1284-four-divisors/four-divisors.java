class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int jha = 0;

        for(int i = 0;i<n;i++){
              int count = 0;
              int sum = 0;
            for(int j = 1;j*j<=nums[i];j++){
                if(nums[i]%j == 0){
                    sum = sum+j;
                    count++;
                if(j!=nums[i]/j){
                    sum= sum+nums[i]/j;
                    count++;
                }
            }
            }
            if(count==4) jha = jha+sum;
        }
        return jha;
    }
}