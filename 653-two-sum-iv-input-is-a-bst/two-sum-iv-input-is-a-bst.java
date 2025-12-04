class Solution {
    TreeNode top = null;
    TreeNode cur = null;
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (top == null) top = root;
        cur = root;
        return find(top, k - root.val) || findTarget(root.left, k) || findTarget(root.right, k);
    }

    public boolean find(TreeNode node, int value) {
        if (node == null) return false;
        return node.val < value ? find(node.right, value) : node.val > value ? find(node.left, value) : cur == node ? false : true;
    }
}