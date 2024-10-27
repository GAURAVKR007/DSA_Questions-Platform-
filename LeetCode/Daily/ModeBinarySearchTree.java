import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class ModeBinarySearchTree {

     ArrayList<Integer> arr = new ArrayList<>();

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        arr.add(root.val);
        postOrder(root.right);
    }

    public int[] findMode(TreeNode root) {
        postOrder(root);
        HashMap<Integer, Integer> map = new HashMap<>();
        

        for (int x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        int idx = 0;

        int maxValue = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int val = e.getValue();
            int key = e.getKey();

            if (maxValue < val) {
                maxValue = val;
            }
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int val = e.getValue();
            int key = e.getKey();

            if (maxValue == val) {
                res.add(key);
            }
        }

        int[] sol = new int[res.size()];
        
        for(int x : res){
            sol[idx++] = x;
        }

        return sol;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        ModeBinarySearchTree solution = new ModeBinarySearchTree();
        int[] result = solution.findMode(root);
        System.out.print("Mode(s): ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
