//package LeetCode.PalindromeLinkedList;
//
//import java.util.ArrayList;
//import java.util.List;
//
//// Runtime 7ms
//
//public class MySolution1 {
//    public boolean isPalindrome(ListNode head) {
//        List<Integer> list = new ArrayList();
//        int length = 0;
//        while(head != null) {
//            list.add(head.val);
//            head = head.next;
//            length++;
//        }
//        for(int i = 0; i < length/2; i++){
//            if(list.get(i) != list.get(length-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }
//}
