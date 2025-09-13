package linkedinpractise.linkedlist;

public class ListNodeTest {
    static int sum(ListNode head) {
        int total = 0;
        while (head!= null) {
            total = total + head.val;
            head = head.next;
        }
        return total;
    }

    public static void main(String[] args) {
        ListNode firstNode = new ListNode(7);
        ListNode secondNode = new ListNode(5);
        ListNode thirdNode = new ListNode(3);
        ListNode forthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(1);
        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = fifthNode;
        System.out.println(sum(head));
    }
}
