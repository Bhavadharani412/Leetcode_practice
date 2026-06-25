class Solution {
    int l = 0;
    int ans = 0;

    public int findBottomLeftValue(TreeNode root) {
        ans = root.val;
        dfs(root, 0);
        return ans;
    }
    public void dfs(TreeNode root, int level) {
        if (root == null) return;
        dfs(root.left, level + 1);
        if (root.left == null && root.right == null && level > l) {
            ans = root.val;
            l = level;
        }
        dfs(root.right, level + 1);
    }
}