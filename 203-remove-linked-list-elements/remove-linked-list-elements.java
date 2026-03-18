class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        while(head!=null && head.val == val){
            head=head.next;
        }
        ListNode iter = head, prev = null;
        for(iter = head; iter != null; iter = iter.next){
            if(iter.val == val){
                if(iter.next == null) prev.next = null;
                prev.next = iter.next;
            }
            else prev = iter;
        }
        return head;
    }
}