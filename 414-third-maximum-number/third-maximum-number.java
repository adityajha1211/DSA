class Solution {
    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        HashSet<Integer> jha = new HashSet<>();
        for(int ok: nums){
            jha.add(ok);
        }

        for(int num : nums) {
            if(num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if(num > second && num != first) {
                third = second;
                second = num;
            }
            else if(num > third && num != second && num != first) {
                third = num;
            }
        }
        if(jha.size()==1) return nums[0];
        else if(jha.size()==2) return first;
        else return third;
    }
}