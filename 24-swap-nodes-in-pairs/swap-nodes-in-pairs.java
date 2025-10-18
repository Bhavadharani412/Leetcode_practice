class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode q = p;
        while(q.next !=null && q.next.next != null) {
            ListNode f = q.next, s = q.next.next;
            f.next = s.next;
            s.next = f;
            q.next = s;
            q = f;
        }
        return p.next;
    }
}