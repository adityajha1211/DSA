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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<TreeNode> ok = new ArrayList<>();
        ArrayList<TreeNode> ok2 = new ArrayList<>();
        Okay(root1,ok);
        Okay(root2,ok2);
        if(ok.size() != ok2.size()) return false;
        for(int i = 0;i<ok.size();i++){
            if(ok.get(i).val != ok2.get(i).val) return false;
        }
        return true;
    }
    private void Okay(TreeNode root,ArrayList<TreeNode> jha){
        if(root==null) return;
        if(root.left == null && root.right==null){
            jha.add(root);
            return;
        }
        Okay(root.left,jha);
        Okay(root.right,jha);
    }
}