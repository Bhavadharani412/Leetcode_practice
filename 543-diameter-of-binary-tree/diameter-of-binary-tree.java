class Solution {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int height = height(root);
        return res;
    }
    public int height(TreeNode root)
    {
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(lh+rh, res);
        return 1 + Math.max(lh, rh);
    }
}