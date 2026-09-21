class Solution {
    public int findTilt(TreeNode root) {
    if(root==null) return 0;
     root.val = Math.abs(Sum(root.left)-Sum(root.right));
     findTilt(root.left);
     findTilt(root.right);
     return Sum(root);
    }
    private int Sum(TreeNode root){
        if(root==null) return 0;
        return root.val + Sum(root.left)+Sum(root.right);
    }
}