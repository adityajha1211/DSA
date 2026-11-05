class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> jha = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            jha.put(nums[i],jha.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(jha.get(nums[i])==2 && !ans.contains(nums[i])){
                ans.add(nums[i]);
             }
        }
        int[] result = new int[ans.size()];
        for(int i = 0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}