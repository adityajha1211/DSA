class Solution {
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        ArrayList<TreeNode> jha = new ArrayList<>();
        helper(root,jha);
        for(int i = 0;i<jha.size()-1;i++){
            TreeNode a = jha.get(i);
            TreeNode b = jha.get(i+1);
            a.right = b;
            a.left = null;
        }
        TreeNode ok = jha.get(jha.size()-1);
        ok.left = null;
        ok.right = null;
        return jha.get(0);
    }
    private void helper(TreeNode root,ArrayList<TreeNode> jha){
        if(root == null) return;
        helper(root.left,jha);
        jha.add(root);
        helper(root.right,jha);
    }
}