import java.util.*;
public class Leaf {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, result);
        return result;
    }

    public int dfs(TreeNode root, List<List<Integer>> result) {
        if (root == null) return -1;
        int leftHeight = dfs(root.left, result);
        int rightHeight = dfs(root.right, result);
        int rootHeight = Math.max(leftHeight, rightHeight) + 1;
        if (rootHeight == result.size()) result.add(new ArrayList<>());
        result.get(rootHeight).add(root.val);
        return rootHeight;
    }
}
