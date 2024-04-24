//package LeetCode.PalindromeLinkedList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//// Runtime 5ms
//public class Mysolution2 {
//    public boolean isPalindrome(ListNode head) {
//        int[] list = new int[100_000];
//        int length = 0;
//        while (head != null) {
//            list[length] = head.val;
//            head = head.next;
//            length++;
//        }
//        for (int i = 0; i < length / 2; i++) {
//            if (list[i] != list[length - 1 - i]) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
