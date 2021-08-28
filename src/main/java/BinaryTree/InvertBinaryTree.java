package BinaryTree;

/*

    Given the root of a binary tree, invert the tree, and return its root.

    Invert Tree :  This is the mirror of the tree

       Example

          4
        /   \
      2       7        =>
   /    \   /   \
  1      3 6     9


      Invert Tree Or Mirror image of a tree...


          4
        /   \
      7       2
   /    \   /   \
  9      6 3     1


  to solve this problem we can use  :  in this maintain an extra data structure queue
  1=> Level Order Traversal
  2=> PreOrder, PostOrder or Inorder  traversal....



 */


import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {

    TreeNode root;

    public static void main(String[] args) {

        InvertBinaryTree tree = new InvertBinaryTree();

        tree.createTree();

       TreeNode node =  invertTree(tree.root);
        System.out.println(node.data);



    }


    private void createTree(){

        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(7);

        TreeNode fourth = new TreeNode(1);
        TreeNode fifth = new TreeNode(3);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(9);

        root = first;
        first.left = second;
        first.right= third;

        second.left = fourth;
        second.right= fifth;
         third.left =sixth;
         third.right= seventh;

    }



    // recursive solution postorder traversal
    private static TreeNode invertTree(TreeNode root) {

        if(root==null) return root;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // swap
        root.left = right;
        root.right = left;
      //  System.out.println(root.data +" ");


      //  return root;
        return root;
    }

    //iterative solution  Leetcode...
    class Solution {
        public TreeNode invertTree(TreeNode root) {

            // using level order traversal..
            if(root==null) return null;

            Queue<TreeNode> q = new LinkedList<>();

            q.add(root);

            while(!q.isEmpty()){
                TreeNode temp = q.poll();

                // swap logic
                TreeNode tempNode = temp.left;
                temp.left  = temp.right;
                temp.right = tempNode;

                if(temp.left!=null)
                    q.add(temp.left);

                if(temp.right!=null)
                    q.add(temp.right);
            }
            return root;
        }
    }

}
