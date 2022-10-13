import java.util.*;

public class Vertical {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<TreeNode, Integer> colMap = new HashMap<>();

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        colMap.put(root, 0);

        int min =0;
        int max =0;

        while (queue.size() > 0) {
            TreeNode cur = queue.remove();
            int col = colMap.get(cur);
            map.putIfAbsent(col, new ArrayList<>());
            map.get(col).add(cur.val);
            min = Math.min(min, col);
            max = Math.max(max, col);

            if (cur.left != null) {
                queue.add(cur.left);
                colMap.put(cur.left, col - 1);
            }

            if (cur.right != null) {
                queue.add(cur.right);
                colMap.put(cur.right, col + 1);
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            res.add(map.get(i));
        }
        return res;
    }
}
