class Solution {
    public boolean isPalindrome(ListNode head) {
       if(head == null || head.next == null) return true;
        ListNode slow = head , fast = head; 
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow , prev = null;
        while( curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode left = head , right= prev;
        while (right != null) {
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
}