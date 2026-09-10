class Solution {
    public int countDominantNodes(TreeNode root) {
        if(root == null) return 0;
        int count = 0;
        // if(root.right == null && root.left == null){
        //     count++;
            // return count;
        // }
        if(Okay(root.val,root)){
            count++;
            // return count;
        }
        count+=countDominantNodes(root.left);
        count+=countDominantNodes(root.right);
        return count;
    }
    private boolean Okay(int jha, TreeNode root){
        if(root == null) return true;
        if(root.val>jha){
            return false;
        }
        return Okay(jha,root.left) && Okay(jha,root.right); 
    }
}