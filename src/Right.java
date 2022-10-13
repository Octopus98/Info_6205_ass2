import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Right {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null)
            return new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        List<Integer> rightSide = new ArrayList();

        while(!queue.isEmpty()){
            int size = queue.size();
            while (size -- > 0){
                TreeNode current = queue.poll();
                if (size == 0)
                    rightSide.add(current.val);

                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
        }
        return rightSide;
    }
}
