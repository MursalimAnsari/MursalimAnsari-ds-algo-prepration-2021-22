package BinaryTree;



/*
    Given the root of a binary tree, return its maximum depth.

   A binary tree's maximum depth is the number of nodes along the longest path from
   the root node down to the farthest leaf node.

        3
     /    \
    9      20
         /    \
        15     7

maxDepth = 3


  Example 1:

   Input: root = [3,9,20,null,null,15,7]
   Output: 3

  Example 2:

  Input: root = [1,null,2]
  Output: 2

  Example 3:

  Input: root = [0]
  Output: 1


 */

import java.util.LinkedList;
import java.util.Queue;

public class MaximumHeightOfBinaryTree {

     BinaryTree.TreeNode root;

    public static void main(String[] args) {



        MaximumHeightOfBinaryTree mh  = new MaximumHeightOfBinaryTree();

        mh.createTree();

        int res = maxDepth(mh.root);
        System.out.println(res);


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


    private static int maxDepth(TreeNode root) {

        if (root==null) return 0;

        int lh= maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1+Math.max(lh,rh);
    }






    // Iterative solution...
    public int maxDepthIterative(TreeNode root) {

        if(root==null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int currDepth = 0;
        while(!queue.isEmpty()) {

            // the depth of the level being processed
            currDepth++;
            int size = queue.size();
            for(int i=0; i< size; i++) {

                TreeNode node = queue.remove();

                if(node.left!=null) {
                    queue.offer(node.left);
                }

                if(node.right!=null) {
                    queue.offer(node.right);
                }
            }

        }

        return currDepth;
    }

}
