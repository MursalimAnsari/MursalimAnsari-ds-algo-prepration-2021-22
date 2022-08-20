package BinaryTree;

/*

  Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of
  nodes visible when tree is visited from Left side. The task is to complete
  the function leftView(), which accepts root of the tree as argument.

Example:
          1
       /     \
     2        3
   /   \    /   \
  4     5   6    7
   \
     8


  Left view of following tree is 1 2 4 8.



 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {

    TreeNode root;


    public static void main(String[] args) {

        RightViewOfBinaryTree rv = new RightViewOfBinaryTree();

        rv.createTree();

        System.out.println("Left view of binary tree is : ");
        ArrayList<Integer> ans =   rightView(rv.root);
        System.out.println(ans);
    }

    private static ArrayList<Integer> rightView(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();

        rightSideView(root, result ,0);

        return result;
    }

    private static void rightSideView(TreeNode root, ArrayList<Integer> result, int currLevel) {

        if (root == null) return;

        Queue<TreeNode> q= new LinkedList<>();

        if (result.size()==currLevel){
            result.add(root.data);
            rightSideView(root.right,result,currLevel+1);
            rightSideView(root.left,result,currLevel+1);

        }
    }

    private void createTree(){

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);

        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        TreeNode eighth = new TreeNode(8);


        root = first;
        first.left = second;
        first.right= third;

        second.left = fourth;
        second.right= fifth;
        third.left = sixth;
        third.right = seventh;
        fourth.right = eighth;


    }


    /*

       for right view we have to add element in the queue as :

       1=>  add right node
       2=>  add left node

     */

}
