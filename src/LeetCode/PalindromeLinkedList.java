//package LeetCode;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class PalindromeLinkedList {
//    public static void main(String[] args) {
//        LinkedList<Integer> nums = new LinkedList<>();
//        nums.push(1);
//        nums.push(2);
//        nums.push(2);
//        nums.push(1);
//        new PalindromeLinkedList().isPalindrome(nums);
//    }
//
//    public boolean isPalindrome(LinkedList<Integer> head) {
//        List<Integer> list = new ArrayList();
//        while (head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//        int length = list.size();
//        for (int i = 0; i < length; i++) {
//            if (list.get(i) != list.get(length - 1 - i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
//
