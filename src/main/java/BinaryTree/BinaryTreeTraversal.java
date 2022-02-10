package BinaryTree;


/*
  INPUT  : 1 2 4 8 11 45 23
  OUTPUT :
  INORDER TRAVERSAL   :  8 2 11 1 45 4 23
  PREORDER TRAVERSAL  :  1 2 8 11 4 45 23
  POSTORDER TRAVERSAL :  8 11 2 45 23 4 1
 */


import sun.reflect.generics.tree.Tree;

import java.util.*;

public class BinaryTreeTraversal {

    TreeNode root;

    public static void main(String[] args) {

        BinaryTreeTraversal btr = new BinaryTreeTraversal();
        btr.createTree();
//            inOrderTraversal(btr.root);
//            System.out.println(" ");
//            System.out.println("PreOrder Recursive :");
//            preOrderTraversal(btr.root);
//            System.out.println("Postorder recursive : ");
//            postOrderTraversal(btr.root);
//            System.out.println();

//            System.out.println("Iterative InOrder :");
//            inorderIterative(btr.root);

//        System.out.println("Iterative PreOrder");
//        preorderTraversalIterative(btr.root);

//        System.out.println("Level Order traversal : ");
//        levelOrderTraversal(btr.root);
//        System.out.println();

//        System.out.println("Post Order Iterative : " );
//        postOrderIterative(btr.root);


        System.out.println("Reverse Level Order traversal: ");
        reverseLevelOrderTraversal(btr.root);


    }


    private void createTree() {

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(4);
        TreeNode fourth = new TreeNode(8);
        TreeNode fifth = new TreeNode(11);
        TreeNode sixth = new TreeNode(45);
        TreeNode seventh = new TreeNode(23);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;

    }

    // Recursive solution to tree traversal
    // 1. Inorder tree traversal...

    public static void inOrderTraversal(TreeNode root) {

        if (root == null) return;

        // left -root - right
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);

    }

    public static void preOrderTraversal(TreeNode root) {

        if (root == null) return;

        // root -left- right
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }


    public static void postOrderTraversal(TreeNode root) {

        if (root == null) return;

        // root -left- right

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }


    private static void inorderIterative(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();

        if (root == null) return;

        // assign root to a new node temp...
        TreeNode temp = root;

        while (!s.isEmpty() || temp != null) {

            if (temp != null) {
                s.push(temp);
                temp = temp.left;
            } else {
                temp = s.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }

        }

    }

    private static void preorderTraversalIterative(TreeNode root) {

        if (root == null) return;

        Stack<TreeNode> s = new Stack<>();

        s.push(root);

        while (!s.isEmpty()) {
            TreeNode temp = s.pop();

            System.out.println(temp.data);

            if (temp.right != null) {

                s.push(temp.right);
            }
            if (temp.left != null) {

                s.push(temp.left);

            }

        }
    }

//        Stack<TreeNode> s = new Stack<>();
//
//        TreeNode current = root;
//
//        while(true){
//            while(current!=null){
//                System.out.print(current.data +" ");
//                s.push(current);
//                current = current.left;
//            }
//
//            if(s.isEmpty()) break;
//
//            current = s.pop();
//            current = current.right;
//
//        }
//    }

    private static void postOrderIterative(TreeNode root) {

        // asked in goldman saches

        Stack<TreeNode> s = new Stack<>();

        TreeNode current = root;
        TreeNode pre = null;

        while (true) {
            while (current != null) {
                s.push(current);
                current = current.left;
            }
            if (s.isEmpty()) break;

            while (current == null && !s.isEmpty()) {

                current = s.peek();

                if (current.right == null || current.right == pre) {
                    System.out.print(current.data + " ");
                    s.pop();
                    pre = current;
                    current = null;
                } else {
                    current = current.right;
                }
            }
        }
    }

    private static void levelOrderTraversal(TreeNode root) {

        // check root is null or not
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty()) {

            // create new node temp and assign root to temp

            TreeNode temp = q.poll();

            System.out.print(temp.data + " ");

            if (temp.left != null) q.offer(temp.left);
            if (temp.right != null) q.offer(temp.right);
        }
    }


    private static void reverseLevelOrderTraversal(TreeNode root) {

        List<Integer> res = new ArrayList<>();

        // check root is null or not
        if (root == null) return;

      Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {

            // create new node temp and assign root to temp
            TreeNode temp = q.poll();
            res.add(temp.data);

            //System.out.print(temp.data + " ");
            if (temp.right != null) q.add(temp.right);
            if (temp.left != null) q.add(temp.left);


        }

        Collections.reverse(res);

        System.out.println(res);

    }
}
     /*

       leetcode solution
     class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

         List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            List<Integer> currentLevel = new ArrayList<>();

            for(int i=0; i<size;i++){
                TreeNode current = q.remove();
                currentLevel.add(current.val);
                 if (current.left != null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }

               res.add(currentLevel);
        }

        return res;
    }
}


      */



