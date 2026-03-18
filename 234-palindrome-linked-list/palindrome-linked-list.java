class Solution {
    public boolean isPalindrome(ListNode head) {
     // find mid point, 
     // reverse the second half
     // compare the first and second half
        ListNode slow, fast;
        for(slow = head, fast = head; fast != null && fast.next != null;slow = slow.next, fast = fast.next.next);
        ListNode curr = slow, prev = null, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right, left;
        for(right = head, left = prev; left != null; right = right.next, left = left.next){
            if(right.val != left.val) return false;
        }
        return true;
    }
}