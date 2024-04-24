//package LeetCode.PalindromeLinkedList;
//
//public class FiveMicroSecond {
//    public boolean isPalindrome(ListNode head) {
//        if (head == null || head.next == null)
//            return true;
//
//        // Step 1: Find the midpoint of the linked list
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast.next != null && fast.next.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        // Step 2: Reverse the second half of the linked list
//        ListNode secondHalf = reverseList(slow.next);
//
//        // Step 3: Compare the first half with the reversed second half
//        ListNode firstHalf = head;
//        while (secondHalf != null) {
//            if (firstHalf.val != secondHalf.val)
//            {
//                return false;
//            }
//
//            firstHalf = firstHalf.next;
//            secondHalf = secondHalf.next;
//
//        }
//        return true;
//    }
//
//    // Helper function to reverse a linked list
//    private ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode current = head;
//        while (current != null) {
//            ListNode nextNode = current.next;
//            current.next = prev;
//            prev = current;
//            current = nextNode;
//        }
//        return prev;
//    }}
