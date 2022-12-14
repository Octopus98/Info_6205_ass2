import java.util.*;

public class Zigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        zigzagHelp(root, 0, res);
        return res;
    }

    public void zigzagHelp(TreeNode root, int level, List<List<Integer>> list) {

        if (root == null) return;
        if (list.size() <= level) list.add(new ArrayList<>());
        if (level % 2 == 0) list.get(level).add(root.val);
        else {
            list.get(level).add(0, root.val);
        }
        zigzagHelp(root.left, level + 1, list);
        zigzagHelp(root.right, level + 1, list);
    }
}
