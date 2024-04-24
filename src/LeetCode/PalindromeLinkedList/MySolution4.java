//package LeetCode.PalindromeLinkedList;
//
//// Runtime 4ms
//public class MySolution4 {
//
//    private static final int[] list = new int[100_000];
//    public boolean isPalindrome(ListNode head) {
//        int length = 0;
//        final int[] revList = list;
//        while(head != null) {
//            list[length]=head.val;
//            head = head.next;
//            length++;
//        }
//        for(int i = 0; i < length; i++){
//            if(list[i] != revList[--length]){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
