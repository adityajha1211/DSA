public class Codec {
    int i = 0;
    public String serialize(TreeNode root) {
        if(root == null) return "#";
        return root.val +","+ serialize(root.left)+","+serialize(root.right);
    }   
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        i = 0;
        return Okay(arr);
    }
    private TreeNode Okay(String[] arr){
        String value = arr[i++];
        if(value.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(value));
        root.left = Okay(arr);
        root.right = Okay(arr);
        return root;
    }
}
