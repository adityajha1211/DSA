class Solution {
    public TreeNode convertBST(TreeNode root) {
        ArrayList<Integer> ok = new ArrayList<>();
        Inorder(root,ok);
        int sum = 0;
        for(int i = ok.size()-1;i>=0;i--){
            sum = sum+ ok.get(i);
            ok.set(i,sum);
        }
        Update(root,ok);
        return root;
    }
    public void Inorder(TreeNode root,ArrayList<Integer> ok){
        if(root == null) return;
        Inorder(root.left,ok);
        ok.add(root.val);
        Inorder(root.right,ok);
    }
    int jha = 0;
    public void Update(TreeNode root, ArrayList<Integer> ok){
        if(root== null) return;
        Update(root.left,ok);
        root.val = ok.get(jha++);
        Update(root.right,ok);
    }
}