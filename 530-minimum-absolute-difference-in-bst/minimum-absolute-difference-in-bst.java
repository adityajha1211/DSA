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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Build(root,ans);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<ans.size()-1;i++){
            min = Math.min(min,Math.abs(ans.get(i)-ans.get(i+1)));
        }
        return min;
    }
    private void Build(TreeNode root,ArrayList<Integer> ans){
        if(root==null) return;
        Build(root.left,ans);
        ans.add(root.val);
        Build(root.right,ans);
    }
}