class Solution {
    int res = 0;
    public int findTilt(TreeNode root) {
        int tilt = tilt(root);
        return res;
    }
    private int tilt(TreeNode root)
    {
        if(root == null) return 0;
        int l = tilt(root.left);
        int r = tilt(root.right);
        res += Math.abs(r - l);
        return root.val + l + r;
    }
}