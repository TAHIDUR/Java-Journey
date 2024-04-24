package LeetCode.ReorderList;

import DataStructure.ListNode;

import java.util.Arrays;

class Solution1 {
    private static final int[] list = new int[100_000];

    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
        ListNode second = new ListNode(2, null);
        ListNode third = new ListNode(3, null);
        ListNode fourth = new ListNode(4, null);
        ListNode last = new ListNode(5, null);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = last;
        new Solution().reorderList(head);
    }

    public void reorderList(ListNode head) {
        ListNode h = head;
        int size = 0;
        while (h != null) {
            list[size++] = h.val;
            h = h.next;
        }
        final int[] result = new int[size];
        int length = size;
        int middle = size/2;
        int index = 0;
        int resultIndex = 0;
        while(index<middle){
            head.val = list[index];
            head = head.next;
            resultIndex++;
            head.val = list[--size];
            head = head.next;
            index++;
            resultIndex++;

        }
        if(length%2==1){
            head.val = list[index];
            head = head.next;
        }
    }


}
