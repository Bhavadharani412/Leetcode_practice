class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;
        ListNode temp = head;
        while(temp.next!=null){
            int value = gcd(temp.val, temp.next.val);
            ListNode newnode = new ListNode(value);
            newnode.next = temp.next;
            temp.next = newnode;
            temp = temp.next.next;
        }
        return head;

    }
    public int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
}
