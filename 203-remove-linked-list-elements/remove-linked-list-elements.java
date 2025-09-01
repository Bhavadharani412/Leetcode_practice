class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        if(head.next != null) fast = fast.next;
        while( fast != null){
            if(fast.val == val){
                fast = fast.next;
                slow.next = fast;
            }else{
                slow = slow.next;
                fast = fast.next;
            }
        }
        return (head.val != val) ? head : head.next;
    }
}