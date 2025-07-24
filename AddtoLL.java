
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


class AddtoLL {
    public int helper(Node head) {
        Node temp = head;
        if (temp == null)
            return 1;
        int carry = helper(temp.next);
        temp.data = temp.data + carry;
        if (temp.data < 10)
            return 0;
        temp.data = 0;
        return 1;
    }
    public Node addOne(Node head) {
        // code here.
        int carry=helper(head);
        if(carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
}