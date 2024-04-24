package DataStructure;


public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {

    }
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void show() {
        ListNode head = new ListNode(this.val, this.next);
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(head.val);
    }
    public void print(ListNode head) {
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(head.val);
    }
}