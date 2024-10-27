

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class SymmetricTree {

    
    public static boolean same(TreeNode root1,TreeNode root2){

         if(root1 == null && root2 == null){
            return true;
         }
       

        if(root1 == null || root2 == null){
            return false;
        }

        if(root1.val != root2.val){
            return false;
        }

        // if(root1.val == root2.val){
        //     return true;
        // }


        return same(root1.left,root2.right) && same(root1.right,root2.left);

        


       

        // if(first && second){
        //     return true;
        // }

        // return false;
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }

        if(root.left == null || root.right == null){
            return false;
        }

        TreeNode root1 = root.left;
        TreeNode root2 = root.right;

        boolean sym = same(root1,root2);

        return sym;
        
    }
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        // Check if the binary tree is symmetric
        boolean isSymmetric = isSymmetric(root);

        // Print the result
        if (isSymmetric) {
            System.out.println("The binary tree is symmetric.");
        } else {
            System.out.println("The binary tree is not symmetric.");
        }
    }

}
