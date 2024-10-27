import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class TreeBfs {
    public static void main(String[] args) {
        // Create a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform BFS on the tree
        System.out.println("BFS Traversal:");
        ArrayList<Integer> res = new ArrayList<>();
        res = bfs(root);

        for(int x : res){
            System.out.print(x+" ");
        }

    }

    // Your implementation of the bfs function goes here
    public static ArrayList<Integer> bfs(TreeNode root) {
        // Implement BFS here using a queue
        // You can follow the previous example for guidance
        // ...

        if(root == null){
            return new ArrayList<Integer>();
        }


        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode currNode = queue.poll();

            if (currNode != null) {
                int val = currNode.val;
                result.add(val);

                // Add left and right children to the queue
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }

        return result;
    }
}
