//package LeetCode.PalindromeLinkedList;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//
//// Runtime: 13ms
//class Stack {
//    public boolean isPalindrome(ListNode head) {
//        Stack<ListNode> st = new Stack<>();
//
//        ListNode temp = head;
//        if (head == null || head.next == null) {
//            return true;
//        }
//
//        // Push all nodes onto the stack
//        while (temp != null) {
//            st.push(temp);
//            temp = temp.next;
//        }
//
//        temp = head;
//        // Compare each node with the popped nodes from stack
//        while (temp != null) {
//            if (temp.val != st.pop().val) {
//                return false;
//            }
//            temp = temp.next;
//        }
//        return true;
//    }
//}