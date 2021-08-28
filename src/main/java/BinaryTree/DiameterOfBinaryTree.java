package BinaryTree;

public class DiameterOfBinaryTree {

    TreeNode root;
   static int max =0;


    public static void main(String[] args) {

        DiameterOfBinaryTree dbt = new DiameterOfBinaryTree();

        dbt.createTree();

        int ans = findDiameterOfBinaryTree(dbt.root);
        System.out.println(ans);

    }

    private void createTree(){

        TreeNode first = new TreeNode(3);
        TreeNode second = new TreeNode(9);
        TreeNode third = new TreeNode(20);

        TreeNode fourth = new TreeNode(15);
        TreeNode fifth = new TreeNode(7);
        TreeNode sixth = new TreeNode(80);

        root = first;
        first.left = second;
        first.right= third;

        third.left = fourth;
        third.right= fifth;
        fifth.left = sixth;

    }


        private static int findDiameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }

        private static int helper(TreeNode node){
        if(node == null)return 0;
        int left = helper(node.left);
        int right = helper(node.right);
        max = Math.max(max,(left+right));
        return 1 + Math.max(left,right);
    }

}
