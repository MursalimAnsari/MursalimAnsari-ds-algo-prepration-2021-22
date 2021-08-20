package BinaryTree;

public class CreateTree {

    TreeNode root =null;


    static class TreeNode{

        TreeNode left;
        TreeNode right;
        int data ; // Generic data...

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {




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

   

}
