public class MaxDepth {
    public int maxDepth (TreeNode root){
        int left;
        int right;
        if (root == null) return 0;
        left =maxDepth(root.left);
        right = maxDepth(root.right);
        return java.lang.Math.max(left,right)+1;
    }
}
