//package LeetCode.PalindromeLinkedList;
//
//// Runtime 4ms
//public class MySolution3 {
//
//    private static final int[] list = new int[100_000];
//    public boolean isPalindrome(ListNode head) {
////        int[] list = new int[100_000];
//        int length = 0;
//        while(head != null) {
//            list[length]=head.val;
//            head = head.next;
//            length++;
//        }
//        for(int i = 0; i < length; i++){
//            if(list[i] != list[--length]){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
