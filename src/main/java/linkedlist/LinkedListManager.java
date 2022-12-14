package linkedlist;


import java.util.List;

public class LinkedListManager {

   static ListNode head;

      static class ListNode{

           int val;

           ListNode next;

           public ListNode(int val) {
               this.val = val;
               this.next=null;
           }
       }


    public static void main(String[] args) {

          LinkedListManager list = new LinkedListManager();

          // adding elements at first position in linked list
          list.addAtFirst(20);
          list.addAtFirst(10);

          // adding elements at last position in linked list
          list.addAtLast(30);
          list.addAtLast(40);
          list.addAtLast(50);
          list.addAtLast(60);
          list.addAtLast(70);

          list.printList();
          System.out.println();

//          list.insertAtPosition(2, 5);
//          list.printList();

//       ListNodevoid result=  list.findMiddleNode(head);
//        System.out.println(result.val);

          reverseLinkedList();
          list.printList();
    }

    private static void reverseLinkedList( ) {

         //valid solution
        // head->1->2->3->4->5->6->7->null

          ListNode prev= head;
          ListNode curr= head.next;

          while(curr!=null){

              ListNode next= curr.next;

              curr.next = prev;

              //update
              prev = curr;
              curr = next;

          }

          // base
          head.next=null;
          head = prev;

       // leetcode ::  return head

      }

    private ListNode findMiddleNode(ListNode head) {

        // head->1->2->3->4->5->6->7->null

         if(head==null){
             return null;
         }

         if(head.next==null){
             return head;
         }

         ListNode slow=head, fast= head.next;

         while(fast!=null && fast.next!=null){

             fast= fast.next.next;
             slow= slow.next;
         }

         return slow;
      }

    private void insertAtPosition(int position, int val) {

          int count = position-1;
          ListNode node = new ListNode(val);

          ListNode dummy = head;

          while(count>1){
              dummy = dummy.next;
              count--;
          }

          ListNode temp;
          //  head->1->2->3->4->null
          // pos =2, val =5

          temp =dummy.next;
          dummy.next =node;
          node.next =temp;

    }

    private void addAtLast(int val) {

          ListNode node = new ListNode(val);

          if(head==null){

              head = node;
              return;
          }

          ListNode dummy = head;

          while(dummy.next!=null){
              dummy = dummy.next;
          }

          dummy.next = node;
      }

    private void addAtFirst(int val) {

         ListNode node= new ListNode(val);

         if(head==null){
             head=node;
              return;
         }

         //   head->1->2->null
         // node 10->null
           node.next= head;
           head = node;
    }

    public  void  printList(){

           ListNode dummy = head;

           if(dummy==null){
               System.out.println("list is empty");
           }

           while (dummy!=null){

               System.out.print(dummy.val + "->");

             dummy = dummy.next;
           }

        System.out.println("NULL");

    }

}

