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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> jha = new ArrayList<>();
        dfs(root,jha);
        int i = 0, j = jha.size()-1;
        while(i<j){
            if(jha.get(i)+jha.get(j)==k) return true;
            if(jha.get(i)+jha.get(j)>k) j--;
            else i++;
        }
        return false;
    }
    private void dfs(TreeNode root,ArrayList<Integer> jha){
        if(root == null) return;
        dfs(root.left,jha);
        jha.add(root.val);
        dfs(root.right,jha);
    }
}