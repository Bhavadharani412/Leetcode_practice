/*
prev.next.next --> null
 last node next --> head
 remove  prev .next = null
 repeat the same for k % size times
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        
        if (head == null || head.next == null || k == 0) return head;
        // size
        int size = 0;
        ListNode iter = head;
        while(iter != null)
        {
            iter = iter.next;
            size++;
        }
        // rotate logic
        int rotcnt = k % size;
        while(rotcnt!= 0 )
        {
            ListNode prev = null;
            ListNode curr = head;
            while(curr.next != null)
            {
                prev = curr;
                curr = curr.next;
            }
            curr.next = head;
            prev.next = null;
            head = curr;
            rotcnt--;
        }
        return head;
    }
}