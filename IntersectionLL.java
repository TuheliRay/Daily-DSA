public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class IntersectionLL{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==t2)
            return t1;
            if(t1==null)
            t1=headB;
            if(t2==null)
            t2=headA;
        }
        return t1;
        
    }
}