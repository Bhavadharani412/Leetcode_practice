class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }
    private int dfs(TreeNode root, int max){
        if(root == null) return 0;
        int cnt = 0;
        if(root.val >= max) cnt = 1;
        max = Math.max(root.val, max);
        cnt += dfs(root.left, max) + dfs(root.right, max);
        return cnt;
    }
}