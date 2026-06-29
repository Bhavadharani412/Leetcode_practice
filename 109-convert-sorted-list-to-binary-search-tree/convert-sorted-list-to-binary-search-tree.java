class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return build(head);
    }
    private TreeNode build(ListNode head)
    {
        if(head == null) return null;
        if(head.next==null){
            return new TreeNode(head.val);
        }

        // ListNode start = head;
        ListNode marker = null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            marker = slow;
            slow = slow.next;
            
        }
        marker.next = null;
        TreeNode root = new TreeNode(slow.val);
        
        root.left = build(head);
        root.right = build(slow.next);
        return root;
    }
}