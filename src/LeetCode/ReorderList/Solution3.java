package LeetCode.ReorderList;

import DataStructure.ListNode;

class Solution3 {
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
        if(head.next != null){
            ListNode pointer = head;
            ListNode reversedList = new ListNode();
            int length = 0;
            while(pointer != null){
                ListNode local = new ListNode(pointer.val, reversedList);
                reversedList = local;
                pointer = pointer.next;
                length++;
            }
            if(length == 2) return;
            ListNode pointer2 = reversedList;
            pointer = head.next;
            ListNode list = new ListNode(head.val);
            ListNode pointerlist = head;
            int i = 0;
            //length = (length%2 == 0)?length : length-1;
            System.out.println(length);
            while(i<length-1){
                if(i%2 == 0){
                    pointerlist.next = new ListNode(pointer2.val);
                    pointerlist = pointerlist.next;
                    pointer2 = pointer2.next;
                }else{
                    pointerlist.next = new ListNode(pointer.val);
                    pointerlist = pointerlist.next;
                    pointer = pointer.next;
                }
                i++;
            }
            head = list;
        }
    }
}
