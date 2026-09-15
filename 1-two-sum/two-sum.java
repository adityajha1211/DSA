class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0;i<nums.length;i++){
        //     for(int j =i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //        return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
        HashMap<Integer,Integer> jha = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int ok = target-nums[i];
            if(jha.containsKey(ok)){
                return new int[]{jha.get(ok),i};
            }
             jha.put(nums[i],i);
        }
        return new int[]{-1,-1};
     }
}