package BinaryTree;


/*
  INPUT  : 1 2 4 8 11 45 23
  OUTPUT :
  INORDER TRAVERSAL   :  8 2 11 1 45 4 23
  PREORDER TRAVERSAL  :  1 2 8 11 4 45 23
  POSTORDER TRAVERSAL :  8 11 2 45 23 4 1
 */


import java.util.Stack;

public class BinaryTreeRecursion {

    TreeNode root;

    public static void main(String[] args) {

      BinaryTreeRecursion btr = new BinaryTreeRecursion();
      btr.createTree();
//         inOrderTraversal(btr.root);
//         System.out.println(" ");
//         preOrderTraversal(btr.root);
//        System.out.println(" ");
//        postOrderTraversal(btr.root);

        System.out.println("Iterative InOrder :");
        inorderIterative(btr.root);


    }


    static class TreeNode{

        TreeNode left;
        TreeNode right;
        int data ; // Generic data...

        public TreeNode(int data) {
            this.data = data;
        }
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
     third.left = sixth;
     third.right= seventh;

   }

   // Recursive solution to tree traversal
   // 1. Inorder tree traversal...

   public static void inOrderTraversal(TreeNode root){

        if (root==null) return ;

        // left -root - right
        inOrderTraversal(root.left);
        System.out.print(root.data +" ");
        inOrderTraversal(root.right);

   }

    public static void preOrderTraversal(TreeNode root){

        if (root==null) return ;

        // root -left- right
        System.out.print(root.data +" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }


    public static void postOrderTraversal(TreeNode root){

        if (root==null) return ;

        // root -left- right

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data +" ");
    }


    private static  void inorderIterative(TreeNode root){
        Stack<TreeNode> s= new Stack<>();

        if(root==null) return;

        // assign root to a new node temp...
        TreeNode temp = root;

        while(!s.isEmpty() || temp!=null){

            if(temp!=null){
                s.push(temp);
                temp = temp.left;
            } else {
                temp = s.pop();
                System.out.print(temp.data +" ");
                temp = temp.right;
            }

        }

    }
}

