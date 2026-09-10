class Solution {
    public int averageOfSubtree(TreeNode root) {
        if(root == null) return 0;
        int count = 0;
        if(root.val == Sum(root)/Count(root)){
            count++;
        }
        count+=averageOfSubtree(root.left);
        count+=averageOfSubtree(root.right);
        return count;
    }
    private int Sum(TreeNode root){
        if(root == null) return 0;
        return root.val + Sum(root.left)+ Sum(root.right);
    }
    private int Count(TreeNode root){
        if(root == null) return 0;
        return 1 + Count(root.left)+Count(root.right);
    }
}