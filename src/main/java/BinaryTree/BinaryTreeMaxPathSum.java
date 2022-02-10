package BinaryTree;

public class BinaryTreeMaxPathSum {

    static TreeNode root;

    public static void main(String[] args) {

        BinaryTreeMaxPathSum mps = new BinaryTreeMaxPathSum();

        mps.createTree();
      int ans =  maxPathSum( mps.root);
        System.out.println(ans);
    }


    private void createTree() {

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

    }

    public static int maxPathSum(TreeNode root) {

        int []  maxVal = new int[1];

        maxVal[0] = Integer.MIN_VALUE;

        maxPathDown(root, maxVal);

        return maxVal[0];
    }

    public static int maxPathDown(TreeNode node , int maxVal[]){

        if(node==null)return 0;

        int left = Math.max(0, maxPathDown(node.left,maxVal));
        int right = Math.max(0, maxPathDown(node.right,maxVal));

        maxVal[0] = Math.max(maxVal[0], left+right+node.data);

        return Math.max(left , right)+node.data;
    }

}
