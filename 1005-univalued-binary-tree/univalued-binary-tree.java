/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        int ok = root.val;
        return Okay(root,ok);
    }
    private boolean Okay(TreeNode root, int ok){
        if(root==null) return true;
        if(root.val != ok) return false;
        return  Okay(root.left,ok) && Okay(root.right,ok);
    }
}