class Solution {
public int[] maxProductPair(int[] nums, int target) {
    int n = nums.length;
    int max = Integer.MIN_VALUE;
    int ok = -1;
    int ok2 = -1;
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (nums[i] + nums[j] == target &&
                nums[i] != nums[j]) {
                int product = nums[i] * nums[j];
                if (product > max) {
                    max = product;
                    if (nums[i] > nums[j]) {
                        ok = i;
                        ok2 = j;
                    } else {
                        ok = j;
                        ok2= i;
                    }
                }
            }
        }
    }
    return new int[]{ok,ok2};
}
}