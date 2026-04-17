class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        return true;
    Deque<TreeNode> dq = new LinkedList<>();
    dq.addFirst(root.left);
    dq.addLast(root.right);
    while(!dq.isEmpty()){
        TreeNode front = dq.pollFirst();
        TreeNode rear = dq.pollLast();

        if(front == null && rear == null)
            continue;

        if(front == null || rear == null)
            return false;

        if(front.val != rear.val)
            return false;

        /* left subtree nodes in front */
        dq.addFirst(front.right);
        dq.addFirst(front.left);

        /* right subtree nodes in rear */
        dq.addLast(rear.left);
        dq.addLast(rear.right);
    }
    return true;
    }
}