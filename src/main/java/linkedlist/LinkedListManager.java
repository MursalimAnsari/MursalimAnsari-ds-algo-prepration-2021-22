package linkedlist;


public class LinkedListImplementation {

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

          LinkedListImplementation list = new LinkedListImplementation();

        // list.head = new ListNode(0);

          list.addAtFirst(20);
          list.addAtFirst(10);


          list.addAtLast(30);
          list.addAtLast(40);

          list.printList();


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

