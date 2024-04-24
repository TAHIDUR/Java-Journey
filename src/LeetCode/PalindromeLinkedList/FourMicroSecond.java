//package LeetCode.PalindromeLinkedList;
//
//public class FourMicroSecond {
//    public ListNode reverse(ListNode head){
//        ListNode prev = null;
//        ListNode curr = head;
//        while(curr!=null){
//            ListNode future = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = future;
//
//        }
//        return prev;
//
//    }
//    public boolean isPalindrome(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while(fast!=null && fast.next!=null){
//            slow =slow.next;
//            fast = fast.next.next;
//        }
//        ListNode mid = slow;
//        ListNode newhead = reverse(mid.next);
//        mid.next = newhead;
//
//        ListNode temp2 = newhead;
//        ListNode temp1 = head;
//        while(temp2!=null){
//            if(temp1.val!=temp2.val)return false;
//            temp1 = temp1.next;
//            temp2 = temp2.next;
//        }
//
//        if(temp1.val!=mid.val)return false;
//        return true;
//
//
//
//
//    }
//}
