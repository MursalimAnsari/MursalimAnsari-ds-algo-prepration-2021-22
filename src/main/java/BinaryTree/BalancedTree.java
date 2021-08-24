package BinaryTree;

/*

        Given a binary tree, determine if it is height-balanced.

        A binary tree in which the left and right subtrees of
         every node differ in height by no more than 1.

             1
           /    \
         2        2
        /  \
       3    3      height(left) for(1) = 3, height(right) = 1  =>  3-1 = 2
      /  \         
     4    4

         Input: root = [1,2,2,3,3,null,null,4,4]
         Output: false

 */


public class BalancedTree {
    TreeNode root;


    public static void main(String[] args) {

        BalancedTree bt = new BalancedTree();

        bt.createTree();

       boolean ans =  bt.isBalanced(bt.root);

        System.out.println(ans);

    }




    private void createTree(){

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(8);
        TreeNode fifth = new TreeNode(11);
        TreeNode sixth = new TreeNode(45);
        TreeNode seventh = new TreeNode(23);

        root = first;
        first.left = second;
        first.right= third;
        second.left = fourth;
        second.right = fifth;
        fourth.left = sixth;
        fourth.right= seventh;

    }


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
    }
}
