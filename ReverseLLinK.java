/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ReverseLLinK {
    public ListNode findNode(ListNode temp , int k){
        k--;
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseLL(ListNode temphead){
        ListNode temp=temphead;
        ListNode front=null , prev=null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return temphead;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode kthNode=null , prevNode=null;
        while(temp!=null){
            kthNode=findNode(temp , k);
            if(kthNode==null){
                if(prevNode!=null)
                prevNode.next=temp;
                break;
            }
            ListNode nextNode=kthNode.next;
            kthNode.next=null;
            reverseLL(temp);
            if(temp==head)
            head=kthNode;
            else
            prevNode.next=kthNode;
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }
}