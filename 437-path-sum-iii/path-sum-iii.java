class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        // if(targetSum==0) return 0;
        if(root == null) return 0;
        return helper(root,targetSum)+pathSum(root.left,targetSum)+pathSum(root.right,targetSum);
    }
     private int helper(TreeNode root,long targetSum){
        if(root == null) return 0;
        int count = 0;
        if(targetSum == root.val){
           count+=1;
        }
        count+=helper(root.left,targetSum - root.val);
        count+=helper(root.right,targetSum - root.val);
        return count;
    }
}