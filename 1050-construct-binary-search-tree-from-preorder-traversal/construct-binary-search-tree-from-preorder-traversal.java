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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return Build(preorder,Integer.MAX_VALUE);
    }
    private TreeNode Build(int[] preorder,int upperbond){
        if(i==preorder.length|| preorder[i]>upperbond) return null;
        TreeNode root = new TreeNode(preorder[i++]);
        root.left = Build(preorder,root.val);
        root.right = Build(preorder,upperbond);
        return root;
    }
}