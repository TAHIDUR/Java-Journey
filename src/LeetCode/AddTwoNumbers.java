package LeetCode;

import DataStructure.ListNode;

import java.util.Arrays;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        ListNode head1 = new ListNode(2, null);
        ListNode second = new ListNode(4, null);
        ListNode third = new ListNode(3, null);
        head1.next = second;
        second.next = third;


        ListNode head2 = new ListNode(5, null);
        ListNode fourth = new ListNode(6, null);
        ListNode last = new ListNode(4, null);
        head2.next = fourth;
        fourth.next = last;

        new AddTwoNumbers().addTwoNumbers(head1, head2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = Integer.valueOf(revString(l1).toString());
        int num2 = Integer.valueOf(revString(l2).toString());
        int sum = num1+num2;
        int size = String.valueOf(sum).length();
        ListNode result = new ListNode();
        for (int i = 0; i < size; i++){
            int reminder = sum%10;
            sum = sum/10;
            result.val=reminder;
            result.next=null;
        }
        return result;
    }

    public static StringBuilder revString(ListNode h){
        StringBuilder builder = new StringBuilder();
        while (h != null) {
            builder.append(h.val);
            h = h.next;
        }
        return builder.reverse();
    }

}
